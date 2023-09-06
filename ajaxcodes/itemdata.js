function loadData()
{
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
    document.getElementById("items").innerHTML+=d.userid+" "+d.username+" "+d.emailid+" "+d.address+" "+d.PaymentMode+" "+d.mobile+"<br/>" 
 }
        }
    }
 xhtp.open("GET","http://localhost:8080/getallusers",true)
 xhtp.getResponseHeader("Content-Type","application/json")
 xhtp.send()
}
function saveData()
{
    var userid=document.getElementById("userid").value
    var username=document.getElementById("username").value
    var emailid=document.getElementById("emailid").value
    var address=document.getElementById("address").value
    var PaymentMode=document.getElementById("PaymentMode").value
    var mobile=document.getElementById("mobile").value
    var userobj={
        "userid":userid,
        "username":username,
        "emailid":emailid,
        "address":address,
        "PaymentMode":PaymentMode,
        "mobile":mobile
    }
    var xhtp=new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
    if(this.readyState==4 && this.status==200)
        {
            console.log(this.responseText)
        }
    }
    xhtp.open("POST","http://localhost:8080/getallusers",true)
 xhtp.getResponseHeader("Content-Type","application/json")
 xhtp.send(JSON.stringify(userobj))
}


