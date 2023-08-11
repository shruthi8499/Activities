package com.functional;
import java.util.*;
public class SortCustomer {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("Alex", "Postpaid", "Delhi", 500));
        customerList.add(new Customer("Peter", "Prepaid", "Hyd", 100));
        System.out.println("Sort based on customer name");
        customerList.sort((i,j)->i.getCustomerName().compareTo(j.getCustomerName()));
        customerList.forEach(System.out::println);
        customerList.removeIf((i)->i.getPlanAmount()>200);
        customerList.forEach(System.out::println);
	}

}
