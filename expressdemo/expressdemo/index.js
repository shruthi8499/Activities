import express from 'express'
import path from 'path'
const app=express()
var itemarray=[]
app.use(express.json())
app.get("/",(req,res)=>{
    res.send("Hello from express app")
})
app.get("/home",(req,res)=>{
    res.sendFile('index.html',{root:"c:/expressdemo"})
})

app.get("/allitems",(req,res)=>{
    res.send(itemarray)
})
app.post("/additem",(req,res)=>{
    itemarray.push(req.body)
    res.send("item added sucessfully")
})
app.post("/data",(req,res)=>{
    console.log(req.body)
    res.send("data received")
})
app.put("/update",(req,res)=>{
    let filter_array=itemarray.filter((e)=>e.itemname!=req.body.itemname)
    itemarray=[...filter_array,req.body]
    res.send("item updated")
})
app.delete("/delete",(req,res)=>{
    let filter_array=itemarray.filter((e)=>e.itemname!=req.body.itemname)
    itemarray=[...filter_array,]
    res.send("item deleted")
})

app.get("/item/:itemname",(req,res)=>{
    console.log(req.params.itemname)
})

const server=app.listen(5059,()=>{
    console.log(server.address().address)
    console.log(server.address().port)
})