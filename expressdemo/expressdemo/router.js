import express from 'express'
import path from 'path'
import route from './route.js'

app.use(express.json())
const server=app.listen(5059,()=>{
    console.log(Server.address().address)
    console.log(server.address().port)
})
app.use("/coffee",route)