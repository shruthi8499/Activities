package com.collector;
/*observe class below

public class Customer 
 { 
     private String firstName;  
     private String lastName;
     private String emailId;
     private Location location;
     
  }
  
  public class Location 
   { 
    private String locationName;
    private String state;
    }  


#Create the object of customer class  and store in list 
#use stream to get the list of customer first ,lastname and location as list of seperate strings*/
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CustomerList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list=new ArrayList<>();
		list.add(new Customer("alex","jones","abc@gmail.com",new Location("hyd","telangana")));
		list.add(new Customer("sam","zon","efg@gmail.com",new Location("chennai","tamilnadu")));
		list.add(new Customer("alice","smith","huc@gmail.com",new Location("bangalore","karnataka")));
		List<String> fname=list.stream().map(Customer::getFirstName).collect(Collectors.toList());
		System.out.println(fname);
		List<String> lname=list.stream().map(Customer::getLastName).collect(Collectors.toList());
		System.out.println(lname);
		List<String> loc=list.stream().map(e->e.getLocation().getLocationName()).collect(Collectors.toList());
		System.out.println(loc);
	}

}
