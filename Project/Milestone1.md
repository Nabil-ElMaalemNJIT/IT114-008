<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Nabil El Maalem (nre3)</td></tr>
<tr><td> <em>Generated: </em> 3/6/2023 7:01:40 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/nre3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><ol><li>You will be updating this folder with new code as you do milestones</li><li>You won't be creating separate folders for milestones; milestones are just branches</li></ol><li>Create a milestone1.md file inside the Project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5 (clients should be having names at this point and not ids)</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/222993792-89c4c990-fe88-404d-8a56-6104ccb80bc6.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows that the Server is setup and Clients are listening from the<br>command line.  (Server is on bottom left)<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/222993892-65d8f2e4-de11-486d-86fc-9588281e0c92.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows client successfully waiting for an input. Seen in the terminals below!<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <ol><li>The server-side connection monitors and logs the transmitted messages before broadcasting them to<br>the connected clients. The server acts as the intermediary, listening to the socket<br>for incoming connections or directives. Once the client sends a message to the<br>server, it is relayed to all connected clients (assuming they are in the<br>same room).</li><li>Once the client-side connection is established through "connect localhost:3000" to the server,<br>the client can send messages to communicate with the server. Each client is<br>allocated a new socket, and requests are handled on separate threads. The server<br>receives the message request for processing, and ServerThread manages the various lines generated<br>for different clients.</li><li>The steps include: Compiling both the server and client files. Once<br>those have complied we then do Java."whatever folder".Server and Java."whatever folder".Client. After that<br>the server should be running the clients should be connected. If they are<br>you will get the correct corresponding outputs.</li></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/222994023-ff7e2b46-8a99-4c7e-a553-02bf4296d799.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows that two clients are connected to the server and that clients<br>can send messages through to the server as well as it being broadcasted.<br>It also identifies who sent it by saying &quot;User[Thread-<em>Number</em>]&quot;.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/222998286-a09f40b4-5c4d-44b3-b9c6-39f1587bbd93.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows being able to join and create rooms<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/222999728-dd4c8cc2-a7b4-4149-a572-11d8834bb746.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>shows different rooms don&#39;t allow for messages to go through. Only if clients<br>are in the same room, then they will see each others messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <ol><li>Once the client is connected to the server without any errors, the client<br>can input writing to the server. Once that writing is sent it goes<br>through the server which takes in that information and broadcasts it to the<br>rest of the clients.&nbsp;</li><li>What ServerThread does is process the multiple different threads that<br>have been initiated to the respective clients. Acts like a server-side representation of<br>a single client.**</li><li>Once the client is connected to the server, the client can<br>join a room. If a client joins a room they will then be<br>in that room with whoever else joined that room. If no one is<br>in the room then the client will still be able to send messages<br>that will be broadcasted but no one will receive them. If there are<br>other clients in the room then they will receive the broadcast but only<br>if they are specifically in that room.&nbsp;</li><li>Once the client is connected to the<br>server without any errors the client waits to receive messages. If a message<br>is sent from another client then it will go through the server and<br>the other clients will receive a message that states what the other client<br>said as well as who said it. It then stays in the chat<br>and this process is repeated.&nbsp;</li></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/223015337-e311a4a1-f415-4d0c-8ef9-6a993fae9fe2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The first image shows when a client disconnects from the server. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/223279264-777f694c-5136-4652-a3e6-b066761876a4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image choses the server terminating (bottom left) (denoted by command line being<br>available again), with clients disconnected but still running <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <ol><li>The disconnection of the client from the Socket Perspective occurs when the connection<br>is closed through the "close()" method of the respective side, or in the<br>event of an exception that results in the termination of the main code<br>flow or thread.</li><li>The client program doesn't crash when the server disconnects/terminates because a<br>try-catch is used so that in the event that the server is disconnected<br>or terminated then it goes to that catch and uses the corresponding exception<br>so that it will return outputs that tell the client an appropriate response.&nbsp;</li><li>The<br>server doesn't crash from the client(s) disconnecting because there is a try-catch that<br>is embedded in the code which has a catch for an exception that<br>occurs when a client disconnects.&nbsp;</li></ol><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/6">https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/6</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Talk about any issues or learnings during this assignment</td></tr>
<tr><td> <em>Response:</em> <p>I did have one issue during this assignment which was that the code<br>was not running correctly when I tried to use Part 5. The issue<br>was that the ports would not work between the server and the client.<br>I went through the code but I was unable to find the issue.<br>As an alternative, I was able to use Part 4 which did work<br>correctly. I still do plan on using Part 5 but for this assignment,<br>I used Part 4. Other than that one minor issue I did not<br>have any issues with this assignment. (I did receive help from both Prof.Toegel<br>and one of the TAs)<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-milestone1/grade/nre3" target="_blank">Grading</a></td></tr></table>