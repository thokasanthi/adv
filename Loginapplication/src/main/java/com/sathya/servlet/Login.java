package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException {
		String Username=request.getParameter("Username");
		String password=request.getParameter("password");
		
		//step-1:process the data
		String status;
		if(Username.equals("Sathya")&& password.equals("Sathya@123"))
		{
			RequestDispatcher dispatcher=request.getRequestDispatcher("success.html");
			dispatcher.forward(request, response);
		}
		else
		{
			//render to the response  to client
			PrintWriter writer=response.getWriter();
			response.setContentType("text/html");
			writer.println("Login fail check the credentials once..");
			RequestDispatcher dispatcher=request.getRequestDispatcher("Login.html");
			dispatcher.include(request, response);
		}
	}

	
	}


