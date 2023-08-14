/*view the class Below        10 mins

  public class Customer 
 { 
   private String customerName;
   private String location;
   private String planType;
   private int planRange;
   private float amount;
//getter setter methods 
 } 

 #filter those customers whose planRange is above 3 months 
 #filter those customer whose plant amount is above 500 
 #calculate a discount of 20% over amount and add to amount to diplay for all customer of location Mumbai
 #Return object of customer based on below requirement 
           run an allMatch to check if all customer planRange is above 300
           run an anyMatch to check any customer with planRange above 600*/

package com.mystream;

public class Customer {
	private String customerName;
	private String location;
	private String planType;
	private int planrange;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String location, String planType, int planrange, float amount) {
		super();
		this.customerName = customerName;
		this.location = location;
		this.planType = planType;
		this.planrange = planrange;
		this.amount = amount;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public int getPlanrange() {
		return planrange;
	}
	public void setPlanrange(int planrange) {
		this.planrange = planrange;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	private float amount;
	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", location=" + location + ", planType=" + planType
				+ ", planrange=" + planrange + ", amount=" + amount + "]";
	}

}
