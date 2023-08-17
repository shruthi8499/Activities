package com.CustomerSql;

import java.sql.*;

public class Customer {
	public static final String url="jdbc:mysql://localhost:3306/test";
	public static final String username="root";
	public static final String password="admin";
	Connection con;
	Statement stat;
	public void dbconnect(){
	try {
		con=DriverManager.getConnection(url,username,password);
		System.out.println("connection established");
		System.out.println(con.getMetaData().getDatabaseProductName());
		System.out.println(con.getClientInfo());
		
	}
	catch(Exception e) {
		System.out.println(e);
		
	}
	}
	public void executeStatement1() {
		String query="create table customer(customerid int primary key,firstname varchar(20),lastname varchar(20),phno varchar(20),billamt int, billduedate varchar(20),customeraddress varchar(50),packageid int,foreign key (packageid)references package(packageid))";
		try {
			stat=con.createStatement();
			boolean result=stat.execute(query);
			if(result) {
				System.out.println("Table not created");
			}
			else {
				System.out.println("Table created");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void executeStatement2() {
		String query="create table package(packageid int primary key,packagename varchar(20),packagerate int,totaldays int)";
		try {
			stat=con.createStatement();
			boolean result1=stat.execute(query);
			if(result1) {
				System.out.println("Table not created");
			}
			else {
				System.out.println("Table created");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public void batchRecord()
	{
		try
		{
			con.setAutoCommit(false);
			stat.addBatch("insert into customer values(1,'sam','jones','84999929586',500,'29-12-2022','hyd',1)");
			stat.addBatch("insert into customer values(2,'jhon','smith','8478952215',300,'15-12-2022','delhi',2)");
			int [] res=stat.executeBatch();
			con.commit();
			for (int i:res)
			{
				System.out.println(i);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			try
			{
				con.rollback();
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			
		}
	}
	public void batchRecord1()
	{
		try
		{
			con.setAutoCommit(false);
			stat.addBatch("insert into package values(1,'abc',2,5)");
			stat.addBatch("insert into package values(2,'bcd',8,4)");
			int [] res=stat.executeBatch();
			con.commit();
			for (int i:res)
			{
				System.out.println(i);
			}
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			try
			{
				con.rollback();
			}
			catch(Exception e1) {
				System.out.println(e1);
			}
			
		}
	}
	public void insertcustomerData( int customerid,String firstname,String lastname,String phno,int billamnt,String billduedate,String customeraddress,int packageid)
	{
		String query="insert into customer values(?,?,?,?,?,?,?,?)";
		try
		{
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, customerid);
			stat.setString(2,firstname);
			stat.setString(3,lastname);
			stat.setString(4,phno);
			stat.setInt(5,billamnt);
			stat.setString(6,billduedate);
			stat.setString(7,customeraddress);
			stat.setInt(8,packageid);
			int records_inserted=stat.executeUpdate();
			System.out.println(records_inserted+"records inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void insertpackageData( int packageid,String packagename,int packagerate,int totaldays)
	{
		String query="insert into package values(?,?,?,?)";
		try
		{
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, packageid);
			stat.setString(2,packagename);
			stat.setInt(3,packagerate);
			stat.setInt(4,totaldays);
			int records_inserted=stat.executeUpdate();
			System.out.println(records_inserted+"records inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	

}
