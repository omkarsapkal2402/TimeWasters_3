package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {
		public static Connection getConnection(){
				
				String driver="com.mysql.cj.jdbc.Driver";
				String url="jdbc:mysql://localhost:3306/hackathon";
				String username="root";
				String pass="9809249090";
				Connection con=null;
				try{
					Class.forName(driver);  
					con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hackathon","root","9809249090");
					System.out.println("Connected to Database...");
				}
				catch(Exception e){}
				//System.out.println("Connected to Database...");
				
				
				
				return con;		
			}
}
