import express from 'express'
const route=express.Router()
route.use((req,res,next)=>{
    console.log("Time:"+Date.now())
    next()
})
route.get("/",(req,res)=>{
    res.send("You are at the base url,view for docs for more info")
})
route.get("/coffeebeans",(req,res)=>{
    res.send("Yay!we are view coffe beans")
})
route.get("/about",(req,res)=>{
    res.end("About us!")
})
export default route