package com.jbk.MySQL;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;

//import com.mysql.jdbc.ResultSet;
//import com.mysql.jdbc.Statement;
import java.sql.*;
public class jdbcSelect {

	public static void main(String[] args) {
		Statement stmt;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
			
			stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select *from proddet");
			
			while(rs.next())
			{
				int id=rs.getInt("prodid");
				String nm=rs.getString("prodnm");
				int cost=rs.getInt("prodcost");
				
				System.out.println("ID is : "+id);
				System.out.println("Name is:  "+nm);
				System.out.println("Cost is:  "+cost);
			}
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
}
}