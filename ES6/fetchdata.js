function fetchData()
{
    const response=fetch("http://localhost:8080/getallMessages")
    response.then((e)=>console.log(e))
}
fetchData()