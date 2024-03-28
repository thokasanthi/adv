package com.sathya.jdbcex;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EditproductServlet")
public class EditproductServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ProId=request.getParameter("proId");
		ProductDao productDao=new ProductDao();
		
		Product existingProductDao=productDao.getProductById(ProId);
		// add the product object to the request object
		request.setAttribute("existingProduct", existingProductDao);
		// forward the request to edit_form.jsp
		RequestDispatcher dispatcher=request.getRequestDispatcher("edit_form.jsp");
		dispatcher.forward(request, response);
	}

}
