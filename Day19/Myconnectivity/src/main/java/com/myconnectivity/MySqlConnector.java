package com.myconnectivity;
import java.sql.*;

public class MySqlConnector {
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
	public void executeStatements() {
		String query="create table items(itemid int primary key,itemname varchar(20))";
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
	public void insertRecords() {
		String insertCom="insert into items values(1,'Ice Tea')";
		try {
			int rec=stat.executeUpdate(insertCom);
			System.out.println("record inserted"+rec);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	public void getRecords() {
		String query="select * from items";
		try {
			ResultSet res=stat.executeQuery(query);
			while(res.next()) {
				int itemid=res.getInt(1);
				String itemName=res.getString(2);
				System.out.println("item id:"+itemid);
				System.out.println("item name:"+itemName);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	public void showRecords(int itemid)
	{
		String query="select * from items where itemid=?";
		try
		{
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, itemid);
			ResultSet result=stat.executeQuery();
			while(result.next())
			{
				int item_id=result.getInt("itemid");
				String itemName=result.getString("itemname");
				System.out.println("item id"+item_id);
				System.out.println("item name"+itemName);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		
		
	}
	public void insertItemData(int itemid, String itemname)
	{
		String query="insert into items values(?,?,)";
		try
		{
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, itemid);
			stat.setString(2,itemname);
			int records_inserted=stat.executeUpdate();
			System.out.println(records_inserted+"records inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}