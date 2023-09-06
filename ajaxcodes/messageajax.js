
function fetchMessages() {
    var xhtp=new XMLHttpRequest()
 xhtp.onreadystatechange=function(){
 if(this.readyState==4 && this.status==200)
        {
 console.log("status ready")
 console.log(this.responseText)
 var rest=this.responseText
 var data=JSON.parse(rest)
 for(d of data){
    console.log(d)
    document.getElementById("messageList").innerHTML+=d.messageId+" "+d.sender+" "+d.receiver+" "+d.messageText+"</br>"
 }
        }
    }
 xhtp.open("GET","http://localhost:8080/getAllMessages",true)
 xhtp.getResponseHeader("Content-Type","application/json")
 xhtp.send()
}

// Function to send a new message
function sendMessage()
{
    var messageId=document.getElementById("messageId").value
    var sender=document.getElementById("sender").value
    var receiver=document.getElementById("receiver").value
    var messageText=document.getElementById("messageText").value
    var userobj={
        "messageId":messageId,
        "sender": sender,
        "receiver": receiver,
        "messageText": messageText
    }
    var xhtp=new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
    if(this.readyState==4 && this.status==200)
        {
            console.log(this.responseText)
        }
    }
    xhtp.open("POST","http://localhost:8080/getallMessages",true)
 xhtp.getResponseHeader("Content-Type","application/json")
 xhtp.send(JSON.stringify(userobj))
}
