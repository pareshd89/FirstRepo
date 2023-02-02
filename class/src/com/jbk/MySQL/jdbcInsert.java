package com.jbk.MySQL;
import java.sql.*;

public class jdbcInsert {

	public static void main(String[] args) {
		Statement stmt=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
			stmt=con.createStatement();
			stmt.executeUpdate("INSERT INTO proddet VALUES (104,'mi note 10',56000)");
			System.out.println("all records inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	

}
