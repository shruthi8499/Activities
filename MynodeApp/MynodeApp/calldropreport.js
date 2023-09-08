
import http from 'http'
import data from './callrepo.js'
import url from 'url'



const server=http.createServer((req,res)=>{


    if(req.method=="GET" && req.url=="/allcalls")
     { 
        res.write(JSON.stringify(data.data))
        res.end()
     }
     else if(req.method=="POST" && req.url=="/savecall")
      { 
        req.on("data",(d)=>{
        let calldata=JSON.parse(d)
            data.data.push(calldata)
        })
        res.write("data saved")
        res.end()
      }
    else if(req.method=="PATCH" && req.url=="/updatecall") 
    {
        req.on("data",(d)=>{
            let oldlist=data.data
          let calldata=JSON.parse(d)
        let itemlist1=  oldlist.filter((e)=>e.callnumber!=calldata.callnumber) 
          data.data=[...itemlist1,calldata]

        })
        res.write("updated")
        res.end()
    }
   
    else if(req.method=="DELETE" && req.url=="/deletecall")
     {
        req.on("data",(d)=>{
            let oldlist=data.data
          let calldata=JSON.parse(d)
        let itemlist1=  oldlist.filter((e)=>e.callnumber!=calldata.callnumber) 
          data.data=[...itemlist1]

        })
        res.write("call deleted")
        res.end()
     }
     else if(req.method=="PUT" && req.url=="/updatecall")
      { 
        res.end()
      }
})


server.listen(5050,()=>{
  
    console.log("server started")
})