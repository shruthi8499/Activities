package com.CallQuality;
import java.sql.*;
public class CallQuality {
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
	public void executeStatement() {
		String query="create table callquality(callid int primary key,phoneNo varchar(20), callfeedback varchar(100),callrating int,customername varchar(20),calldrop varchar(20))";
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
		String insertCom="insert into callquality values(1,'9934223221','getting frequent call drops',2,'Erric Jones','35%'),(2,' 8873433421','call drops',3,'Mathew Mandis','32%')";
		try {
			int rec=stat.executeUpdate(insertCom);
			System.out.println("record inserted"+rec);
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
	}
	public void getRecords() {
		String query="select * from callquality";
		try {
			ResultSet res=stat.executeQuery(query);
			while(res.next()) {
				int callid=res.getInt(1);
				String phoneNo=res.getString(2);
				String callfeedback=res.getString(3);
				int callrating=res.getInt(4);
				String customername=res.getString(5);
				String calldrop=res.getString(6);
				System.out.println("call id:"+callid);
				System.out.println("phoneNo:"+phoneNo);
				System.out.println("feedback:"+callfeedback);
				System.out.println("callrating:"+callrating);
				System.out.println("customername:"+customername);
				System.out.println("calldrop:"+calldrop);
			}
		}
		catch(Exception e) {
			System.out.println(e);
			
		}
		
	}
	public void insertcallqualityData(int callid, String phoneNo, String callfeedback , int callrating , String customername ,String calldrop )
	{
		String query="insert into callQuality values(?,?,?,?,?,?)";
		try
		{
			PreparedStatement stat=con.prepareStatement(query);
			stat.setInt(1, callid);
			stat.setString(2,phoneNo);
			stat.setString(3,callfeedback);
			stat.setInt(4,callrating);
			stat.setString(5,customername);
			stat.setString(6,calldrop);
			int records_inserted=stat.executeUpdate();
			System.out.println(records_inserted+"records inserted");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void showRecords(int callrate) {
	    String query = "select * from callquality where callrating > ?";
	    try {
	        PreparedStatement stat = con.prepareStatement(query);
	        stat.setInt(1,callrate );
	        ResultSet res = stat.executeQuery();
	        while (res.next()) 
	        {
	        	int callid=res.getInt("callid");
				String phoneNo=res.getString("phoneNo");
				String callfeedback=res.getString("callfeedback");
				int callrating=res.getInt("callrating");
				String customername=res.getString("customername");
				String calldrop=res.getString("calldrop");
				System.out.println("call id:"+callid);
				System.out.println("phoneNo:"+phoneNo);
				System.out.println("feedback:"+callfeedback);
				System.out.println("callrating:"+callrating);
				System.out.println("customername:"+customername);
				System.out.println("calldrop:"+calldrop);
	            
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
	public void showRecords1(int calldropping) {
		String query = "select * from callquality where callrating > ?";
	    try {
	        PreparedStatement stat = con.prepareStatement(query);
	        stat.setInt(1,calldropping );
	        ResultSet res = stat.executeQuery();
	        while (res.next()) 
	        {
	        	int callid=res.getInt("callid");
				String phoneNo=res.getString("phoneNo");
				String callfeedback=res.getString("callfeedback");
				int callrating=res.getInt("callrating");
				String customername=res.getString("customername");
				String calldrop=res.getString("calldrop");
				System.out.println("call id:"+callid);
				System.out.println("phoneNo:"+phoneNo);
				System.out.println("feedback:"+callfeedback);
				System.out.println("callrating:"+callrating);
				System.out.println("customername:"+customername);
				System.out.println("calldrop:"+calldrop);
	            
	        }
	    } catch (Exception e) {
	        System.out.println(e);
	    }
		
	}
}
