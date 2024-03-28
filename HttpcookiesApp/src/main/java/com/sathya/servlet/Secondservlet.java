package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SecondCookies")
public class Secondservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get the data request form data
		String Qualification=request.getParameter("qualification");
		String Designation=request.getParameter("designation");
		
		
		//create the cookies object
		Cookie cookie2=new Cookie("qualification", Qualification);
		Cookie cookie3=new Cookie("designation", Designation);
		//add the cookies into response object
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		//get the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
	}

}
