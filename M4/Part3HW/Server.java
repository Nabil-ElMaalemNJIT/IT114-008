package M4.Part3HW;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Server {
    int port = 3001;
    // connected clients
    private List<ServerThread> clients = new ArrayList<ServerThread>();

    private void start(int port) {
        this.port = port;
        // server listening
        try (ServerSocket serverSocket = new ServerSocket(port);) {
            Socket incoming_client = null;
            System.out.println("Server is listening on port " + port);
            do {
                System.out.println("waiting for next client");
                if (incoming_client != null) {
                    System.out.println("Client connected");
                    ServerThread sClient = new ServerThread(incoming_client, this);

                    clients.add(sClient);
                    sClient.start();
                    incoming_client = null;

                }
            } while ((incoming_client = serverSocket.accept()) != null);
        } catch (IOException e) {
            System.err.println("Error accepting connection");
            e.printStackTrace();
        } finally {
            System.out.println("closing server socket");
        }
    }
    protected synchronized void disconnect(ServerThread client) {
		long id = client.getId();
        client.disconnect();
		broadcast("Disconnected", id);
	}

    protected synchronized void broadcast(String message, long id) {
        if(processCommand(message, id)){

            return;
        }
        // let's temporarily use the thread id as the client identifier to
        // show in all client's chat. This isn't good practice since it's subject to
        // change as clients connect/disconnect
        message = String.format("User[%d]: %s", id, message);
        // end temp identifier

        // loop over clients and send out the message
        Iterator<ServerThread> it = clients.iterator();
        while (it.hasNext()) {
            ServerThread client = it.next();
            boolean wasSuccessful = client.send(message);
            if (!wasSuccessful) {
                System.out.println(String.format("Removing disconnected client[%s] from list", client.getId()));
                it.remove();
                broadcast("Disconnected", id);
            }
        }
    }


    private boolean processCommand(String message, long clientId){
        System.out.println("Checking command: " + message);

        //Nabil El Maalem (nre3) 2/20/2023
        //What's happening in the coinflip section below is it reads the command "coin flip" and it runs the code which randomly outputs a value
        //between 0-1, 0 being tails and 1 being Heads. It then outputs the result along with the clientID which is broadcasted to everyone.
        //Start
        if(message.equalsIgnoreCase("coin flip")){
            Random ran = new Random();
            int coinFlip = ran.nextInt(2);
            String result;
            if (coinFlip == 0){
                result = "Tails";
            }
            else {
                result = "Heads";
            }
            broadcast(clientId + " Flipped a coin and got " + result, clientId);
        }

        //Nabil El Maalem (nre3) 2/20/2023
        //Below is the roll die implementation
        //What's happening in the roll die section below is that it reads the command "roll #d#" which takes the values of the number of dies and number of sides
        //It then uses parseint to make them ints and uses that to generate the corrsponeding number of dies with each one randomly getting a number that is up to 
        //the number of sides. That's then added and broadcasted to all with the clientID and what they got.
        else if (message.matches("roll \\d+d\\d+")) {
            String[] msgBreakDown = message.split(" ");
            int numDice = Integer.parseInt(msgBreakDown[1].substring(0, msgBreakDown[1].indexOf("d")));
            int numSide = Integer.parseInt(msgBreakDown[1].substring(msgBreakDown[1].indexOf("d") + 1));
            Random ran = new Random();
            int result = 0;
            for (int i = 0; i < numDice; i++) {
                result += ran.nextInt(numSide) + 1;
            }
            broadcast(clientId + " rolled " + numDice + "d" + numSide + " and got " + result, clientId);
        }


        //End
        else if(message.equalsIgnoreCase("disconnect")){
            Iterator<ServerThread> it = clients.iterator();
            while (it.hasNext()) {
                ServerThread client = it.next();
                if(client.getId() == clientId){
                    it.remove();
                    disconnect(client);

                    break;
                }
            }
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Starting Server");
        Server server = new Server();
        int port = 3000;
        try {
            port = Integer.parseInt(args[0]);
        } catch (Exception e) {
            // can ignore, will either be index out of bounds or type mismatch
            // will default to the defined value prior to the try/catch
        }
        server.start(port);
        System.out.println("Server Stopped");
    }
}