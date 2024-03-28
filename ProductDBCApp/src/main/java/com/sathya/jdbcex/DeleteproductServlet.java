package com.sathya.jdbcex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteproductServlet")
public class DeleteproductServlet extends HttpServlet {
	
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ProId=request.getParameter("proId");
		ProductDao ProductDao=new ProductDao();
		int result=ProductDao.deleteById(ProId);
		if(result==1)
		{
			//to send the data to jsp add to request object
			request.setAttribute("DeleteResult", result);
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
			
		}
		else
			request.setAttribute("DeleteResult", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
		dispatcher.forward(request, response);
			
		
	}

	
	}


