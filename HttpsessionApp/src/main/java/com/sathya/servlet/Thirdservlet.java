package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/ThirdSession")
public class Thirdservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		HttpSession session=request.getSession(false);
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<h1> Registration details</h1>");
		writer.print("<pre style=color:red>");
		writer.println("Username:"+session.getAttribute("username"));
		writer.println("Age:"+session.getAttribute("age"));
		writer.println("Qualification:"+session.getAttribute("qualification"));
		writer.println("Designation:"+session.getAttribute("designation"));
		writer.println("Useremail:"+request.getParameter("email"));
		writer.println("Mobile:"+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
