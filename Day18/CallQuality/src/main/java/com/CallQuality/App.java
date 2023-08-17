package com.CallQuality;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	CallQuality obj=new CallQuality();
    	obj.dbconnect();
    	obj.executeStatement();
    	obj.insertRecords();
    	obj.insertcallqualityData(3,"8452617925","getting spam calls",3,"peter","20");
    	obj.insertcallqualityData(4,"8487456795","getting freq calls",8,"alex","60");
    	obj.insertcallqualityData(5,"9885666815","getting spam calls",6,"sam","40");
    	obj.showRecords(4);
    	obj.showRecords1(30);
    	obj.getRecords();
    	
    }
}
