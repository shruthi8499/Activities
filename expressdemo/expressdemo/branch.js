import express from 'express'
import path from 'path'
const app=express()
var brancharray=[]
app.use(express.json())
app.get("/",(req,res)=>{
    res.send("Hello from express app")
})
app.get("/home",(req,res)=>{
    res.sendFile('index.html',{root:"c:/expressdemo"})
})

app.get("/allbranches",(req,res)=>{
    res.send(brancharray)
})
app.post("/addbranch",(req,res)=>{
    brancharray.push(req.body)
    res.send("branch added sucessfully")
})
app.post("/data",(req,res)=>{
    console.log(req.body)
    res.send("data received")
})
app.put("/updatebranch",(req,res)=>{
    let filter_array=brancharray.filter((e)=>e.branchname!=req.body.branchname)
    brancharray=[...filter_array,req.body]
    res.send("branch updated")
})
app.delete("/deletebranch",(req,res)=>{
    let filter_array=brancharray.filter((e)=>e.branchname!=req.body.branchname)
    brancharray=[...filter_array,]
    res.send("item deleted")
})

app.get("/branch/:branchname",(req,res)=>{
    console.log(req.params.branchname)
})

const server=app.listen(5059,()=>{
    console.log(server.address().address)
    console.log(server.address().port)
})