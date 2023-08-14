package com.collector;
import java.util.*;
import java.util.stream.*;
public class ListCollector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> numlist=Arrays.asList(12,10,11,14,25);
		List <Integer> newlist=numlist.stream().filter((e)->e>25).map((e)->e*e).collect(Collectors.toList());
		System.out.println(newlist);*/
		
		ArrayList<CallQuality> callqualitylist=new ArrayList();
		callqualitylist.add(new CallQuality(1,2,4,"8524692712"));
		callqualitylist.add(new CallQuality(6,8,1,"8726189565"));
		callqualitylist.add(new CallQuality(4,2,3,"9965871254"));
		callqualitylist.add(new CallQuality(2,5,7,"9987532146"));
List <String> call_list=callqualitylist.stream().filter((e)->e.getCallDuration()>=2).map((e)->e.getMobileNo()+","+e.getDropRate()).collect(Collectors.toList());
System.out.println(call_list);
	}

}
