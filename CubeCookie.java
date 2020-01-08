package com.deloitte;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Cube
 */
@WebServlet("/cube")
public class Cube extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession ssn=request.getSession();
//		int sum=(int)request.getAttribute("Sum");
		
		int sum=0;
		Cookie []cookies=request.getCookies();
		for(Cookie ck:cookies) {
			if(ck.getName().equals("deloitte.sum")) {
				sum=Integer.parseInt(ck.getValue());
				break;
			}
		}
//		int sum=(int)(ssn.getAttribute("sum"));
		int cube=sum*sum*sum;
		
	response.getWriter().println("sum: "+sum+"\nCube: "+cube);
	
	}

}
