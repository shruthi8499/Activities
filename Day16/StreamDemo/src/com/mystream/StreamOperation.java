package com.mystream;
import java.util.*;
import java.util.stream.Stream;
public class StreamOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Device> list=new ArrayList();
		list.add(new Device("bsc","peter"));
		list.add(new Device("modem","arib"));
		list.add(new Device("connector","alex"));
		Stream<Device> stream=list.stream();
		//stream.filter((e)->e.getTechnicianName().equals("peter")).map((e)->e.toString().toUppercase()).forEach(System.out::println);	
		/*Device d=stream.max((d1,d2)->{
			if(d1.getNo_of_days_assigned()==d2.getNo_of_days_assigned())
			{
				return 0;
			}
			else (d1.getNo_of_days_assigned()>d2.getNo_of_days_assigned())
			{
				return 1;
			}
			else
			{
				return -1;
			}

		}*/
		
		

	}

}
