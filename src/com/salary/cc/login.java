package com.salary.cc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login  extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		try {
			int Employee_ID_Number= Integer.parseInt(req.getParameter("employee_id"));
			String password = req.getParameter("password");
			 Database db = new Database();
			 if(db.check(Employee_ID_Number, password)) {
				 Cookie cookie = new Cookie("userid",Employee_ID_Number+"");
				 res.addCookie(cookie);
				 res.sendRedirect("report?userid="+Employee_ID_Number);
				 
			 }else {
				 res.sendRedirect("login.jsp");
			 }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
}
