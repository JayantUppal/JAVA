package com.login;

import java.sql.*;

public class LoginDao {
	
	final String driverClassName = "com.mysql.jdbc.Driver";
	final String url="jdbc:mysql://localhost:3306/jdbc?useSSL=false";
	final String user="root";
	final String pwd= "";
	String sql="";
	public float check(String u, String p)
	{
		sql= "SELECT * FROM bms WHERE CustomerName=? AND Password=?";
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, u);
			st.setString(2, p);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				float balance = rs.getFloat("Balance");
				return balance;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return (-1);
	}
	public boolean updateBalance(String u, String p, float b)
	{
		sql= "UPDATE bms SET Balance=? WHERE CustomerName=? AND Password=?";	
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setFloat(1, b);
			st.setString(2, u);
			st.setString(3, p);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean createAccount(String u, String p, float b)
	{
		sql = "INSERT INTO bms(CustomerName,Password,Balance) Values(?,?,?)"; 
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, u);
			st.setString(2, p);
			st.setFloat(3, b);
			st.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public boolean deleteAccount(String u, String p)
	{
		sql= "SELECT * FROM bms WHERE CustomerName=? AND Password=?";
		try
		{
			Class.forName(driverClassName);
			Connection con = DriverManager.getConnection(url,user,pwd);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, u);
			st.setString(2, p);
			ResultSet rs = st.executeQuery();
			if(rs.next())
			{
				//System.out.println("here in if!!!");
				sql = "DELETE FROM bms WHERE CustomerName=? AND Password=?";
				st = con.prepareStatement(sql);
				st.setString(1, u);
				st.setString(2, p);
				st.executeUpdate();
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}



