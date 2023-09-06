var SimpleInterest = (principal, rate, time) => (principal * rate * time) / 100;
var principalAmount = 100;
var interestRate = 2;
var timePeriod = 4;

var simpleInterest = SimpleInterest(principalAmount, interestRate, timePeriod);
console.log(`Simple Interest: ${simpleInterest}`);
