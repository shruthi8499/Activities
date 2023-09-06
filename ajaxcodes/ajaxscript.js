function getdata()
{
    var  xhtp=new XMLHttpRequest()
    xhtp.onreadystatechange=function(){
        if(this.readyState==4 && this.status==200)
        {
              console.log("status ready")
              var res=this.responseXML
              var itemlist=res.getElementsByTagName("itemname")
              for(x of itemlist)
              {
                console.log(x)
              }
        }
        
    }
    xhtp.open("GET","item.xml",true)
    xhtp.send()
}