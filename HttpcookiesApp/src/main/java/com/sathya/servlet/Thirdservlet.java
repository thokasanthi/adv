package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ThirdCookies")
public class Thirdservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Useremail=request.getParameter("email");
		String Mobile=request.getParameter("mobile");
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		//reading all cookies
		Cookie[] cookies=request.getCookies();
		writer.println("<html>");
		writer.println("<body bycolor='pink'>");
		writer.println("<h1> Registration details</h1>");
		writer.print("<pre>");
		writer.println("UserName:"+cookies[0].getValue());
		writer.println("Age:"+cookies[1].getValue());
		writer.println("Qualification:"+cookies[2].getValue());
		writer.println("Designation:"+cookies[3].getValue());
		writer.println("Useremail:"+request.getParameter("email"));
		writer.println("Mobile:"+request.getParameter("mobile"));
		writer.println("</pre>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
