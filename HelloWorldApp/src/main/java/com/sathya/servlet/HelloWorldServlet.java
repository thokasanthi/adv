package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/santhi")
public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public HelloWorldServlet() {
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer =response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>welcome sathya tech</h1>");
		writer.println("<h2>welcome to advjava</h2>");
		writer.println("<h3>Rathan sir classes</h3>");
		writer.println("</html>");
		
		
				
	}

}
