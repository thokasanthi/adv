package com.sathya.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteEmployeeServlet")
public class DeleteEmployeeServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String EmpId=request.getParameter("empId");
		EmployeeDao EmployeeDao=new EmployeeDao();
		int result= EmployeeDao.deleteById(EmpId);
		if(result==1)
		{
			//to send the data to jsp add to request object
			request.setAttribute("DeleteResult", result);
			RequestDispatcher dispatcher=request.getRequestDispatcher("employeelist.jsp");
			dispatcher.forward(request, response);
			
		}
		else
			request.setAttribute("DeleteResult", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("employeelist.jsp");
		dispatcher.forward(request, response);
			
		
	}
	}

	

