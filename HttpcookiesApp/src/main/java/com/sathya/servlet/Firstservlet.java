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


@WebServlet("/FirstCookies")
public class Firstservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the  data request form data
		String UserName=request.getParameter("username");
		String Age=request.getParameter("age");
		
		
		
		// create the cookies object
		Cookie cookies0=new Cookie("username", UserName);
		Cookie cookies1=new Cookie("age", Age);
		//add the cookies into responsce object
		response.addCookie(cookies0);
		response.addCookie(cookies1);
		// given the next form
		RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
		dispatcher.forward(request, response);
	}

}
