<table><tr><td> <em>Assignment: </em> IT114 Chatroom Milestone 2</td></tr>
<tr><td> <em>Student: </em> Nabil El Maalem (nre3)</td></tr>
<tr><td> <em>Generated: </em> 4/4/2023 6:43:27 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/nre3" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <p>Implement the features from Milestone2 from the proposal document:&nbsp; <a href="https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view">https://docs.google.com/document/d/1ONmvEvel97GTFPGfVwwQC96xSsobbSbk56145XizQG4/view</a></p>
</td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Payload </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Payload Screenshots</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229380720-33122cab-d069-4656-a583-39ecaf4656f1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>The image shows all the code used in Payload as well as some<br>comments describing what each portion of the Payload code does. Towards the top<br>my name, UCID, and date can be found. <br></p>
</td></tr>
</table></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Server-side commands </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the mentioned commands</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229375084-46b40971-fab0-421d-a0fc-123c9e400bbe.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>In the photo both the flip and roll code is shown with comments<br>distinguishing them. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Explain the logic/implementation of each commands</td></tr>
<tr><td> <em>Response:</em> <p>/roll works by having the user input /roll #d#. The hashtags are the<br>values they choose. Once that is inputted and entered the code then randomly<br>generates what number is rolled and does that the respective (being the number<br>the user input for the first #) number of times. The value is<br>added up and outputs a message that states the number of times the<br>dice were rolled and the values. That is sent as a message to<br>the server and everyone (in the room) is then able to see it.<br><br>/flip<br>works by having the user input /flip. The code then randomly generates a<br>number of either 0 or 1 and depending on which is generated it<br>then goes to its respective part of the if-else statement and outputs the<br>corresponding answer of either &quot;Heads&quot; or &quot;Tails&quot;.&nbsp; Lastly, the code then sends a<br>message to the person who flipped the coin and their result. This is<br>sent to the server and everyone (in the room) is able to see<br>it.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Text Display </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Show the code for the various style handling via markdown or special characters</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229937935-840dd68d-55fb-4639-b168-52b76756ceaf.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows all the code for bold, italics, underline, and color is processed.<br>It is done without having to rely on typing out html tags. <br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Show source message and the result output in the terminal (note, you won't actually see the styles until Milestone3)</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229937244-30e7e260-3801-4192-9a14-c7d23f1d9ac2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how bold, italics, and underline is displayed. <br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229937319-e336c01c-822a-47e5-be04-476bfe3fc6a1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>This shows how the colors (red, green, and blue) are processed and displayed.<br><br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229937582-a976ffe2-b487-4a26-ba33-e9897cb172a1.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>At the bottom in the terminals it shows how the user inputs the<br>delimiters (#r, #g, #b) and then the message is sent out to all<br>the clients with the correct HTML tags surrounding it.<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/123345748/229937763-0db60063-2999-4664-8210-7b9d0f632519.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>At the bottom in the terminals it shows how the user inputs the<br>delimiters (i.e. *b, *i, etc) and then the message sent out to all<br>the clients is the message with the correct HTML tags surrounding it.<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Explain how you got each style applied</td></tr>
<tr><td> <em>Response:</em> <ul><li>For bold I made it so that whatever text is in between "*b"<br>and "b*" would be taken and then the correct HTML tag of &lt;b&gt;<br>and &lt;/b&gt; would be placed around it and outputted.</li><li>For italics I made it<br>so that whatever text is in between "*i" and "i*" would be taken<br>and then the correct HTML tag of &lt;I&gt; and &lt;/i&gt; would be placed<br>around it and outputted.</li><li>For color, I made it so that whatever text is<br>in between, a hashtag and the first letter of the color as well<br>as the first letter of the color and a hashtag, for example, "#r"<br>and "r#". The text between the delimiters would be taken and then the<br>correct HTML tag of, "&lt;font color = \"red\"&gt; " and " &lt;/font&gt;", would<br>be placed around it and outputted.<br></li><ul><li>The method of applying color to the text<br>is the same for all colors I used. In the bullet point above<br>I used red as my example but this applies to all my colors<br>which are red, green, and blue.</li></ul><li>For underlining I made it so that whatever<br>text is in between "*u" and "u*" would be taken and then the<br>correct HTML tag of &lt;u&gt; and &lt;/u&gt; would be placed around it and<br>outputted.</li></ul><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="https://user-images.githubusercontent.com/54863474/211707773-e6aef7cb-d5b2-4053-bbb1-b09fc609041e.png"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Include the pull request for Milestone2 to main</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/11">https://github.com/Nabil-ElMaalemNJIT/IT114-008/pull/11</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-008-S23/it114-chatroom-milestone-2/grade/nre3" target="_blank">Grading</a></td></tr></table>