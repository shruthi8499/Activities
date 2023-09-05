function getUserDetails()
{
    var userelement=document.getElementById("username")
    //console.log(userelement.value);
    var emailid=document.getElementById("emailid")
    //console.log(emailid.value);
    var username=userelement.value
    var email=emailid.value
    if(username.trim().length==0 || email.trim().lenght==0)
    {
        document.getElementById("message").innerHTML="fields cannot be blank"
    }
}