package com.serialization;
import java.io.*;
public class CallRecords {
	public void saveCallQuality(CallQuality call) {
		try {
			FileOutputStream fileout=new FileOutputStream(call.getCallId()+".dat");
			 ObjectOutputStream objectout=new ObjectOutputStream(fileout);
			 objectout.writeObject(call);
			 objectout.flush();
			 objectout.close();
		}
		catch(FileNotFoundException e)
		 {
			 System.out.println(e);
		 }
		 catch(IOException e1)
		 {
			 System.out.println(e1);
		 }
	}
	public void displayCallQuality(int i) {
		try {
			FileInputStream filein =new FileInputStream(i+".dat");
			ObjectInputStream objectin=new ObjectInputStream(filein);
			CallQuality call =(CallQuality)objectin.readObject();
			
			System.out.println(""+call.getCallId());
			System.out.println(" "+call.getCallQualityGrade());
			System.out.println(" "+call.getCallDuration());
			System.out.println(" "+call.getCustomerName());
			
			
		}
		catch(FileNotFoundException e1)
		{
			System.out.println(e1);
		}
		catch(IOException e2)
		{
			System.out.println(e2);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
		
	}

	public static void main(String[] args) {
		
		CallQuality obj1=new CallQuality(345,67,"A","Peter");

		CallRecords records=new CallRecords();

		records.saveCallQuality(obj1);
		records.displayCallQuality(obj1.getCallId());

	}

}