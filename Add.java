package com.deloitte;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/add")
public class SumOfNum extends HttpServlet{
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int n1=Integer.parseInt(req.getParameter("t1"));
		int n2=Integer.parseInt(req.getParameter("t2"));
		int sum=n1+n2;
		//res.getWriter().println("sum= "+sum);
		
		//RequestDispatcher rd=req.getRequestDispatcher("cube");
		HttpSession ssn=req.getSession();
		ssn.setAttribute("sum",sum);
		res.sendRedirect("cube");
//		req.setAttribute("Sum", sum);
//		rd.forward(req, res);
	}
  
}
