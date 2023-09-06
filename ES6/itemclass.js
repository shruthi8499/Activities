class   Item{
    constructor(itemId,itemName,price,quantity) {
        this.itemId=itemId;
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    /*printdetails()
    {
        console.log(`${this.itemId} ${this.itemName}  ${this.quantity} ${this.quantity}`)
    }*/
}
async function getItem(itemId,itemName,price,quantity)
{
    if(price<100)
    {
        throw new Error()
    }
    else
    {
        
        return new Item(itemId, itemName, price, quantity);

    }
}
async function main()
{

    var res=await getItem(1,"Alex",500,5)
    console.log(res)
    //res.then((e)=>console.log(e))
    //.catch((e)=>console.log(e))

}

main()



