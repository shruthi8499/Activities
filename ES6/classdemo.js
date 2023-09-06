class Person{
    constructor(firstname,lastname){
        this.firstname=firstname
        this.lastname=lastname
    }
    printFullname(){
        console.log(`${this.firstname} ${this.lastname}`)
    }
}


class User extends Person{
    constructor(firstname,lastname,role){
        super(firstname,lastname)
        this.role=role
    }
    printRole(){
        console.log(this.role)
    }
}
let user=new User("Peter","Johns","ADMIN")
user.printFullname()
user.printRole()