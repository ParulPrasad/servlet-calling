package com.deloitte;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Cube
 */
@WebServlet("/cube")
public class Cube extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
  	int sum=(int)request.getAttribute("Sum");
		
		int cube=sum*sum*sum;
		response.getWriter().println("sum: "+sum+"\nCube: "+cube);
	}

}
