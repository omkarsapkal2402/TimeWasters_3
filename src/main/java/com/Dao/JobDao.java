package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.Connection.MyConnection;

public class JobDao {
Connection con=MyConnection.getConnection();
	
	public void displayJob(String jSkills){
	try {
		PreparedStatement ps=con.prepareStatement("select *from job where jSkills=?");
		ps.setString(1,jSkills);
		ResultSet rs=ps.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t\t\t"+rsmd.getColumnName(3)+"\t\t\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(5)+"\t"+rsmd.getColumnName(6));
		while(rs.next()){
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t\t"+rs.getInt(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6)); 
		}
	}
	catch (SQLException e) {
		e.printStackTrace();
	} 
	}
}
