package com.sathya.sarvlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Calculation")
public class Calculation extends HttpServlet {
	
   
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//step read the request data
		int  num1=Integer.parseInt(request.getParameter("FirstNumber"));
		int  num2=Integer.parseInt(request.getParameter("SecondNumber"));
		String Operation=(request.getParameter("Operation"));
		//processes the data
		int result=0;
		switch(Operation)
		{
		case "+":result=num1+num2;
				break;
		case "-":result=num1-num2;
				break;
		case "*":result=num1*num2;
				break;
		case "/":result=num1/num2;
				break;
		case "%":result=num1%num2;
		}
	//render response to client
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Calculation result</h1>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<p> First Number:"+num1+"</p>");
		writer.println("<p> Second number:"+num2+"</p>");
		writer.println("<p> your Operation symbol:"+Operation+"</p>");
		writer.println("<p> your result:"+result+"</p>");
		writer.println("</body>");
		writer.println("</html>");
	}
}