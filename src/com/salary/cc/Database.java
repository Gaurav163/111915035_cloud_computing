package com.salary.cc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database {
	String url = "jdbc:mysql://localhost:3306/salary"; 
	 String dbuser="gaurav";
	 String dbpass="Mysql@63";
	 
 
 public static Connection connect = null;
 public static Statement st = null;
 public static ResultSet result = null;
 public static ResultSet result1 = null;
 
 

	
 
 public boolean register(String query) {
	 
	 try {
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.print("Connecting to Mysql ... ");
		 connect = DriverManager.getConnection(url,dbuser,dbpass);
	     st = connect.createStatement();
		 int ms = st.executeUpdate(query);
		 if(ms>=0)
		 return true;
		 else return false;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		return false;
	}
 }
  public boolean check(int username,String password ) {
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
			 System.out.print("Connecting to Mysql ... ");
			 connect = DriverManager.getConnection(url,dbuser,dbpass);
		     st = connect.createStatement();
		  
		  
          String query = "Select * from employees where Employee_ID_Number='"+username+"' and Password='"+password+"'";
          result= st.executeQuery(query);
          if(result.next()) {
        	  return true;
          }else {
        	  return false;
          }    
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
	  return false;
  }
  public User checkuser(int userid) {
	  User user =new User();
	  try {
		  Class.forName("com.mysql.jdbc.Driver");
			 System.out.print("Connecting to Mysql ... ");
			 connect = DriverManager.getConnection(url,dbuser,dbpass);
		     st = connect.createStatement();
		     String query = "Select * from employees where Employee_ID_Number='"+userid+"'";
	         result= st.executeQuery(query);
	         
	         if(result.next()) {
	        	 
	        	 user.Employee_ID_Number = Integer.parseInt(result.getString("Employee_ID_Number"));
	        	 user.First_Name=result.getString("First_Name");
	        	 user.Last_Name= result.getString("Last_Name");
	        	 user.Date_of_Birth=result.getString("Date_of_Birth");
	        	 user.Contact_Number=result.getString("Contact_Number");
	        	 
		         
	         }
	         String query1 = "Select * from salary where Employee_ID_Number="+userid;
        	 System.out.println(query1);
        	 result1= st.executeQuery(query1);
        	 if(result1.next()) {	        	
        	 user.job=result1.getString("Job_Role");
        	 user.salary=result1.getInt("Monthly_Salary");
        	 user.bonus = result1.getInt("Yearly_Bonus");
        	 }
        	 return user;
		
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  return user;
	
  }
}


