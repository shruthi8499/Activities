package com.functional;

public class Recharge {
	int customerid;
	float amount;
	
	public Recharge(int customerid, float amount, String validDate) {
		super();
		this.customerid = customerid;
		this.amount = amount;
		this.validDate = validDate;
	}
	public Recharge() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getValidDate() {
		return validDate;
	}
	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}
	String validDate;

}
