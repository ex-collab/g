package service;

import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.Users;

public class UsersDao 
{

	
	
	public boolean registerUser(Users users)
	{
		boolean result = false;
		Connection connection=null;
		try
		{
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			FileInputStream fis=new FileInputStream("C:\\Users\\lntinfotech\\workspace\\g\\src\\main\\resources\\database.properties"); 
		    Properties p=new Properties (); 
		    p.load (fis); 
		    fis.close();
		    String driver = p.getProperty("jdbc.driver");
		    if(driver != null)
		    	Class.forName(driver);
		    
		    String url = p.getProperty("jdbc.url");
		    String user = p.getProperty("jdbc.user");
		    String password = p.getProperty("jdbc.password");
		    connection =  DriverManager.getConnection(url,user,password);
			PreparedStatement pst=connection.prepareStatement("Insert INTO employe Values(?,?,?,?,?)");
			pst.setString(1 , users.getEid());
			pst.setString(2, users.getFname());
			pst.setString(3, users.getLname());
			pst.setString(4, users.getDoj());
			pst.setString(5, users.getDept());
			int rs = pst.executeUpdate();
			if (rs>0) 
				result=true;
		} 
		catch (Exception s)
		{
			System.out.println(s);
		}
		finally
		{
			try 
			{
				connection.close();
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
		return result;
	}

	
}
