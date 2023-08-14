package com.mystream;
import java.util.ArrayList;
import java.util.stream.Stream;

public class CustomerOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Customer> list=new ArrayList();
		list.add(new Customer("peter","hyd","basic",3,300));
		list.add(new Customer("arib","delhi","premium",4,500));
		list.add(new Customer("alex","mumbai","basic",6,800));
		Stream<Customer> stream=list.stream();
		//stream.filter((e)->e.getPlanrange()>3).forEach(System.out::println);
		//stream.filter((e)->e.getAmount()>500).forEach(System.out::println);
		//System.out.println(stream.allMatch((e)->e.getAmount()>300));
		//System.out.println(stream.anyMatch((e)->e.getAmount()>600));
		stream.filter((e)->e.getLocation().equals("mumbai")).map((e)->e.getAmount()*20/100+e.getAmount()+" "+e.getLocation()).forEach(System.out::println);
		
		

	}

}
