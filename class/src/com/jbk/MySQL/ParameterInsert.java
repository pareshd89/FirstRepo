package com.jbk.MySQL;

import java.sql.*;
import java.util.Scanner;

public class ParameterInsert {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/product","root","root");
			
			PreparedStatement stmt=con.prepareStatement("INSERT INTO proddet VALUES(?,?,?)");
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter PRoduct id");
			 int id=sc.nextInt();
			 stmt.setInt(1,id);
			System.out.println("ENter the prod name");
			 String sd=sc.next();
			 stmt.setString(2, sd);
			System.out.println("Enter Product cost ");
			 int cst=sc.nextInt();
			 stmt.setInt(3, cst);
			stmt.executeUpdate();
			System.out.println("records inserted");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
