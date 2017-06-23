package Utilities;

import java.sql.DriverManager;
import java.sql.ResultSet;

import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class DataBase {
	@Test
public void connectingdatabase()
{
	try{  
		Class.forName("com.mysql.jdbc.Driver");  
		Connection con=(Connection) DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/database1","root","hello@1");  
		//here sonoo is database name, root is username and password  
		Statement stmt=(Statement) con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from customer");  
		while(rs.next())  
		System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
		con.close();  
		}catch(Exception e){ System.out.println(e);}  
		}  

}

