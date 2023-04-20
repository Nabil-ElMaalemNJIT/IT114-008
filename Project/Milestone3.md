<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone3</td></tr>
<tr><td> <em>Student: </em> Nabil El Maalem (nre3)</td></tr>
<tr><td> <em>Generated: </em> 4/19/2023 10:59:58 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone3/grade/nre3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone3 from the proposal document:&nbsp;&nbsp;<a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Connection Screens </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the screens with the following data</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233158456-f96956be-56db-441b-9b7b-e49fa1b903e9.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The left most window has the Host and Port. The middle window shows<br>the prompt for the Username. The right most window shows after the username<br>is inputted and the user is connected to the server.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the code for each step of the process</td></tr>
<tr><td> <em>Response:</em> <ul><li>The port is what port is being used for the clients to connect<br>to the server. So in the image it's 3000</li><li>The host is just the<br>IP address that the server is on which in this instance is just<br>local because it's only being ran on my computer</li><li>The username is the following<br>prompt found in the client after the client connects to the server. It<br>forces the user to input a username which can be seen in the<br>middle window in the image.</li></ul><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Chatroom view </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing the related UI</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233161305-95bee72e-64bc-44e9-a059-7b1b1b78968f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows the list of users in the room, the chat message area<br>with chat history, the create message area and its send button. This can<br>be seen in all of the winows. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233238190-31b7ba01-d5ea-4132-80ee-3c77fc27f30c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Shows the code that lets the enter key to send the message. It<br>can be found towards the top of the code in the image.<br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Chat Activities </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show screenshots of the result of the following commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233234203-bc14115d-97bb-4b93-880e-90c7df17e771.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image clearly shows each user using /flip and /roll, all with different<br>outcomes and it broadcasting what the output was. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the code snippets for each command</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233234308-680a1f7f-71be-4950-8753-c6e5bfeae020.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows the code for /flip and /roll. My UCID and date<br>is also visible in the image.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233234531-c762a7bd-0719-4731-926c-de464dfd5ccf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows the code for all the text formatting and has my<br>UCID and date in the image. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code flow of each command</td></tr>
<tr><td> <em>Response:</em> <ul><li>Roll - For roll it works by breaking down the user message with<br>the "d" in the middle and then uses the first value for the<br>number of dice and the second number for the number sides. It then<br>works by getting a random number using those parameters and adds up the<br>values. Once the values are added up the total is outputted along with<br>who did the roll and the data they used so for example "2d3".<br></li><li>Flip<br>- For flip it works by taking the user command of /flip and<br>then randomly generates a number of either 1 or 0. If its 0<br>then its tails but if its 1 then its heads. It then uses<br>that to then broadcast what the user got and their name</li></ul><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Custom Text </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Screenshots of examples</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233235882-0f714979-bcc3-461b-afe0-706e01d0f37f.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In this image I have it so that it shows all instances asked<br>for which includes bold, italic, colors, underline, and combinations of all of those<br>in larger messages.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233236088-f813b36d-a327-4e82-8d1f-f9ea663dd6d4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows an input string for a message that uses a combination<br>of text attributes <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how you got the UI side to render the text accordingly</td></tr>
<tr><td> <em>Response:</em> <p>I was able to get the UI side to render the text accordingly<br>by going into chatpanel and changing the line of &quot;<span style="font-family: Consolas, &quot;Courier<br>New&quot;, monospace; white-space: pre; color: rgb(78, 201, 176);">JEditorPane</span><span style="background-color: rgb(30, 30, 30); color:<br>rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"> </span><span style="font-family: Consolas,<br>&quot;Courier New&quot;, monospace; white-space: pre; color: rgb(156, 220, 254);">textContainer</span><span style="background-color: rgb(30, 30, 30);<br>color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"> = </span>&lt;span<br>style=&quot;font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(197, 134, 192);&quot;&gt;new</span><span style="background-color: rgb(30,<br>30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;"><br></span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(220, 220, 170);">JEditorPane</span><span style="background-color:<br>rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space:<br>pre;">(</span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(206, 145, 120);">&quot;text/plain&quot;</span><span style="background-color:<br>rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space:<br>pre;">, </span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(156, 220, 254);">text</span>&lt;span<br>style=&quot;background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace;<br>white-space: pre;&quot;&gt;);</span>&quot; and changed the &quot;text/plain&quot; into &quot;text/html&quot; so that it now is<br>&quot;<span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(78, 201, 176);">JEditorPane</span><span style="background-color:<br>rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace; white-space:<br>pre;"> </span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(156, 220, 254);">textContainer</span>&lt;span<br>style=&quot;background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier New&quot;, monospace;<br>white-space: pre;&quot;&gt; = </span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color: rgb(197,<br>134, 192);">new</span><span style="background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas, &quot;Courier<br>New&quot;, monospace; white-space: pre;"> </span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color:<br>rgb(220, 220, 170);">JEditorPane</span><span style="background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas,<br>&quot;Courier New&quot;, monospace; white-space: pre;">(</span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre; color:<br>rgb(206, 145, 120);">&quot;text/html&quot;</span><span style="background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family: Consolas,<br>&quot;Courier New&quot;, monospace; white-space: pre;">, </span><span style="font-family: Consolas, &quot;Courier New&quot;, monospace; white-space: pre;<br>color: rgb(156, 220, 254);">text</span><span style="background-color: rgb(30, 30, 30); color: rgb(212, 212, 212); font-family:<br>Consolas, &quot;Courier New&quot;, monospace; white-space: pre;">);</span>&quot;. This made it so that the text<br>now changes into the correct attribute so the text will actually be bold,<br>italic, underlined, red, blue, etc.&nbsp;<br><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 5: </em> Whisper </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots showing a demo of whisper commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233236579-2bc0517e-2211-4945-a6d7-4903dc491bee.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows how the user uses &quot;@&quot; then the username and the<br>message is only sent to that user. You can see in the bottom<br>window (user kevin) does not see the messages between Nabil and Nora because<br>they are private messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show the server-side code snippets of how this feature works</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233236813-4147cb9b-595b-4229-9c70-3a67fee6b252.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image it shows the code for how the private messages/whisper works.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>The way this code works is that it checks for the @ and<br>once it&#39;s recognized it then checks the username found after the @. This<br>is done with a for loop and goes through all clients, if and<br>when the user is found the message is taken and sent ONLY to<br>the person who was @&#39;d and the person who sent the private message.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 6: </em> Mute/Unmute </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshots demoing this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233244695-2fb0c6ce-bb13-457e-8d2e-d18ae0c5d749.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows in the terminal on the bottom left that user &quot;Nabil&quot;,<br>muted user &quot;Kevin&quot;. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233244839-16626c5b-6ce9-4592-bb9c-1eb204d3f3a4.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This image shows how after user &quot;Kevin&quot; was muted by user &quot;Nabil&quot;, user<br>&quot;Nabil&quot; does not receive user &quot;Kevin&quot;&#39;s messages<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshots of the code snippets that achieve this feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233245183-d4cb2acd-5b0e-41f9-9009-d25f543d54bd.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Towards the top of the image is where the muted logic can be<br>found. If the muted user attempts to send the message it will not<br>send the message to the user who muted them. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233245853-e00a04e3-5838-45b6-9bde-7ca6cafcd9a5.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Line 31 shows the array list used for mutedUsers. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/233246412-23afb186-fef3-4d59-81eb-753f619c179b.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In the terminal it can be seen that user &quot;Kevin&quot; was unmuted by<br>user &quot;Nabil&quot;. It can also be seen that after being unmuted, user &quot;Nabil&quot;<br>can now see user &quot;Kevin&quot;&#39;s messages.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the code logic of how this was achieved</td></tr>
<tr><td> <em>Response:</em> <p>The logic for the mute and unmute code is simply that the user<br>who uses /mute will have the name after the /mute command added to<br>an arraylist called &quot;mutedUsers&quot; which will then be used in the image provided<br>to check if they are muted. If they are then the messages send<br>my the muted user will not reach the individual who muted them. This<br>logic is embedded in if statements so that if the conditions (a user<br>being muted) applies then it will go ahead and continue with them being<br>muted<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 7: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Pull request from milestone3 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/13">https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/13</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone3/grade/nre3" target="_blank">Grading</a></td></tr></table>