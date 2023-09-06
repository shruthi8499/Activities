var customer = {
    customerName: "Erric Sans",
    age: "23",
    address: "23 Old Baker Street",
    available_for_call: true,
  };
  
var { customerName, age, address, available_for_call } = customer;
  
  console.log(`Destructured Customer Details:
  Customer Name: ${customerName}
  Age: ${age}
  Address: ${address}
  Available for Call: ${available_for_call}`);