package com.sathya.servlet;



import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


 
@WebServlet("/FirstSession")
public class Firstservlet extends HttpServlet {
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// get the client data
				
				String Username = request.getParameter("username");
				String Age = request.getParameter("age");
				
				//create session object
				HttpSession session=request.getSession();
				
				//place the data into session object
				session.setAttribute("username", Username);
				session.setAttribute("age", Age);
				// give the next form object to client
				RequestDispatcher dispatcher=request.getRequestDispatcher("form2.html");
				dispatcher.forward(request, response);
			
	}

}
