package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondSession")
public class Secondservlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Qualification=request.getParameter("qualification");
		String Designation=request.getParameter("designation");
		
		//create session object
		HttpSession session=request.getSession(false);
		
		//place the data into session object
		session.setAttribute("qualification", Qualification);
		session.setAttribute("designation", Designation);
		// give the next form object to client
		RequestDispatcher dispatcher=request.getRequestDispatcher("form3.html");
		dispatcher.forward(request, response);
	}

}
