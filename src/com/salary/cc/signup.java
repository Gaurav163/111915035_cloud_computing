package com.salary.cc;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signup")
public class signup extends HttpServlet  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		  int Employee_ID_Number= Integer.parseInt(req.getParameter("employee_id"));
	      String First_Name= req.getParameter("name");
	      String Last_Name = req.getParameter("lname");
	      String Password = req.getParameter("password");
	      String Date_of_Birth= req.getParameter("dob");
	      String Contact_Number = req.getParameter("contact");
	      String query = "INSERT INTO employees (Employee_ID_Number, First_Name, Last_Name,Date_of_Birth,Contact_Number,Password) VALUES ("+Employee_ID_Number+",'"+First_Name+"','"+Last_Name+"','"+Date_of_Birth+"','"+Contact_Number+"','"+Password+"');";
	      Database db = new Database();
	      System.out.println(query);
	      if(db.register(query)) {
	    	  req.setAttribute("message","Signup Sucess");
	    	  res.sendRedirect("login.jsp");
	      }else {
	    	  req.setAttribute("message", "Signup Falied");
	    	  res.sendRedirect("signup.jsp");
	      }
	      
	      
	      
	      
	}
}
