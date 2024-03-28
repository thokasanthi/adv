package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Empolyee")
public class Empolyee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step-1:Read the requested data
		 int empId= Integer.parseInt(request.getParameter("empId"));
	     String empName= request.getParameter("empName");
	     double empBsal= Double.parseDouble(request.getParameter("empBsal"));
	     
	     //step-2: Process the data
	      double HRA,DA,PF,Gross_Salary;
	      
	      if(empBsal>=50000)
	      {
	    	 HRA=0.30*empBsal;
	    	 DA=0.10*empBsal;
	    	 PF=0.06*empBsal;
	      }
	      else if(empBsal>50000 &&empBsal<25000 )
	      {
	    	 HRA=0.20*empBsal;
	    	 DA=0.05*empBsal;
	    	 PF=0.03*empBsal;
	      }
	      else
	      {
	    	 HRA=0.10*empBsal;
	    	 DA=0.03*empBsal;
	    	 PF=0.02*empBsal;
	      }
	      Gross_Salary=empBsal+HRA+DA-PF;
	        
	      //step-3:Render the Response to client
	      
	        response.setContentType("text/html");
		     PrintWriter writer=response.getWriter();	    
		     writer.println("<html>");
		     writer.println("<body bgcolor=skyblue>");
		     writer.println("<h1>Employee Salary Calculations</h1>");
		     writer.println("Employee Id="+empId+"<br><br>");
		     writer.println("Employee Name="+empName+"<br><br>");
		     writer.println("Employee Basic Salary="+empBsal+"<br><br>");
		     writer.println("HRA Amount="+HRA+"<br><br>");
		     writer.println("DA Amount="+DA+"<br><br>"); 
		     writer.println("PF Amount="+PF+"<br><br>");
		     writer.println("Gross Salary="+Gross_Salary+"<br><br>");
		     writer.println("</body>");
		     writer.println("</html>");
	      
	      
	      
	      
	      
	}

}