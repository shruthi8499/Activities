/*let device={name:"teleprinter",assignedto:"Peter",days:12}
let {name,assignedto,days}=device
console.log(name)
console.log(assignedto)
console.log(days)*/
var promiseobj=new Promise((resolve,reject)=>{
    reject("error occurence")
})
promiseobj.then((e)=>console.log(e)).catch((e)=>console.log(e))