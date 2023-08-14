/*package com.collector;
import java.util.*;
import java.util.stream.*;

public class MappingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CallQuality> callQualityList=ArrayList<>();
		//List<String> mylist=list.stream().collect(Collectors.mapping((e)->e.toString().toUppercase().Collectors.toList()));
		callQualityList.add(new CallQuality(1,2,4,"8524692712"));
		callQualityList.add(new CallQuality(6,8,1,"8726189565"));
		callQualityList.add(new CallQuality(4,2,3,"9965871254"));
		callQualityList.add(new CallQuality(2,5,7,"9987532146"));
	CallQuality quality = callQualityList.stream().collect(Collectors.minBy((e1,e2)->{
		if(e1.getDropRate()==e2.getDropRate())
		{
			return 0;
		}
		else if (e1.getDropRate()==e2.getDropRate())
		{
			return 1;
		}
		else
		{
			return-1;
		}
	})).get();
	System.out.println(quality);
			
			
	}
}
*/
