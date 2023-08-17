package com.CustomerSql;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Customer obj=new Customer();
       // obj.dbconnect();
    	//obj.executeStatement1();
    	//obj.executeStatement2();
    	//obj.batchRecord();
    	//obj.batchRecord1();
    	obj.insertcustomerData(1,"alex","jones","84999929586",500,"29-12-2022","hyd",1);
    	obj.insertpackageData(1,"abc",2,5);
    }
}
