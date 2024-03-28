package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


 
 
@WebServlet("/Registerservlet")
public class Registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws  IOException {
	//step1-get the request data
	   String Username=(request.getParameter("Username"));
	   String Password=(request.getParameter("Password"));
	   Long UserMobile=Long.parseLong(request.getParameter("UserMobile"));
	   String Email=(request.getParameter("Email"));
	   String Gender=(request.getParameter("Gender"));
	   String DoB=(request.getParameter("DoB"));
	   String[] Qualification=(request.getParameterValues("Qualification"));
	   String[] Language=(request.getParameterValues("language"));
	   String country=(request.getParameter("country"));
	   String Comment=(request.getParameter("Comment"));
	   //process the data
	   String q=String.join(",",Qualification);
	   String l=String.join("_",Language);
	   //render the resonse to clint
	   PrintWriter writer=(response.getWriter());
	   response.setContentType("text/html");
	   writer.println("<html>");
	   writer.println("<body bgcolor='yellow'>");
	   writer.println("<pre style=color:blue");
	   writer.println("your Username:"+Username+"<br><br>");
	   writer.println("your Password:"+Password+"<br><br>");
	   writer.println("your UserMobile:"+UserMobile+"<br><br>");
	   writer.println("your Email:"+Email+"<br><br>");
	   writer.println("your Gender:"+Gender+"<br><br>");
	   writer.println("your country:"+country+"<br><br>");
	   writer.println("your Qualification:"+q+"<br><br>");
	   writer.println("your Language:"+l+"<br><br>");
	   writer.println("Comment:"+Comment+"<br><br>");
	   writer.println("</pre>");
	   writer.println("</body>");
	   writer.println("</html>");
	   
   }
}
	   
	   
	   
	   
	   
	   
	   

		
	


