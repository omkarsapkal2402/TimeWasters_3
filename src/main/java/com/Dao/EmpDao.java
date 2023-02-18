package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.Connection.MyConnection;
import com.Entity.Employee;

public class EmpDao {
	//Scanner sc=new Scanner(System.in);
	 Connection con=MyConnection.getConnection();
	
	public List<Employee> displayEmp(String eSkills){
		System.out.println(eSkills);
		ResultSet rs=null;
		List<Employee> elst=new ArrayList<Employee>();
		
		try {
		//PreparedStatement ps=con.prepareStatement("select *from emp where eSkills=?");
			PreparedStatement ps=con.prepareStatement("select eId,eName,eMob,eExp,eEdu,eSkills,eDes, match(eSkills,eDes) against(? in boolean mode )as Score from employee order by Score Desc limit 6");
		ps.setString(1,eSkills);
		rs=ps.executeQuery();
		while(rs.next()) {
			Employee e=new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getFloat(8));
			elst.add(e);
			System.out.println(e);
		}
		/*
		 * ResultSetMetaData rsmd = rs.getMetaData();
		 * System.out.println(rsmd.getColumnName(1)+"\t"+rsmd.getColumnName(2)+"\t\t\t"+
		 * rsmd.getColumnName(3)+"\t\t\t"+rsmd.getColumnName(4)+"\t"+rsmd.getColumnName(
		 * 5)+"\t"+rsmd.getColumnName(6)); while(rs.next()){
		 * System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+
		 * "\t\t"+rs.getInt(4)+"\t\t"+rs.getString(5)+"\t\t"+rs.getString(6)); }
		 */
	}
	catch (SQLException e) {
		e.printStackTrace();
	}
	return elst; 
	}
}
