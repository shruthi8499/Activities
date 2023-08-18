package com.myconnectivity;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MySqlConnector obj=new MySqlConnector();
        	obj.dbconnect();
        	obj.executeStatements();
        	//obj.insertRecords();
        	obj.insertItemData(3,"espresso");
        	obj.getRecords();
        	//obj.showRecords;
    }
}
