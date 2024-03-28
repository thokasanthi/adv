package com.sathya.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/productservlet")
public class productsevlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//step1:read the request
		int ProductId=Integer.parseInt(request.getParameter("ProductId"));
		String ProductName=request.getParameter("ProductName");
		double ProductPrice=Double.parseDouble(request.getParameter("ProductPrice"));
		int ProductQuantity=Integer.parseInt(request.getParameter("ProductQuantity"));
		//step-2:process the data
		double total=ProductPrice*ProductQuantity;
		double discount=0,netAmount=0;
		if(total<1000)
		{
			discount=0;
			netAmount=total;
		}
		else if(total>=1000 && total<5000)
		{
			discount=total*0.05;
			netAmount=total-discount;
		}
		else if(total>=5000 && total<10000)
		{
			discount=total*0.1;
			netAmount=total-discount;
		}
		else
		{
			discount=total*0.15;
			netAmount=total-discount;
		}
		//step-3 render the response
		PrintWriter Writer=response.getWriter();
		response.setContentType("text/html");
		Writer.println("<html>");
		Writer.println("<body bgcolor='pink'>");
		Writer.println("<h1>Product Bill Invoice......</h1>");
		Writer.println("Product Id:"+ProductId+"<br><br>");
		Writer.println("Product Name:"+ProductName+"<br><br>");
		Writer.println("Product Price:$"+ProductPrice+"<br><br>");
		Writer.println("Product Quantity:"+ProductQuantity+"<br><br>");
		Writer.println("Total Bill Amount:$"+total+"<br><br>");
		Writer.println("Discount Amount:$"+discount);
		Writer.println("Net Amount to pay:$"+netAmount);
		Writer.println("/body>");
		Writer.println("/html>");
	
	}			
}
	



	
	
	


