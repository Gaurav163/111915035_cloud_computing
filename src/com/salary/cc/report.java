package com.salary.cc;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/report")
public class report extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req,HttpServletResponse res) {
		try {
			int userid = Integer.parseInt(req.getParameter("userid"));
			System.out.println("Report");
			Database db = new Database();
			User user = db.checkuser(userid);
			System.out.println(user);
			HttpSession session = req.getSession();
			session.setAttribute("user", user);
			res.sendRedirect("report.jsp");
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
