package com.sathya.servlet;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read the data
		String empId=request.getParameter("empId");
		String empName=request.getParameter("empName");
		Double empSalary=Double.parseDouble(request.getParameter("empSalary"));
		String empPhono=request.getParameter("empPhono");
		Date empDate=Date.valueOf(request.getParameter("empDate"));
		Part part=request.getPart("empImage");
		InputStream inputStream=part.getInputStream();
		
		// converstion of inpustream int byte[]
		byte[] empImage= IOUtils.toByteArray(inputStream);
		
		//Using above details create the product object
		
		Employee employee=new Employee();
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setEmpSalary(empSalary);
		employee.setEmpPhono(empPhono);
		employee.setEmpDate(empDate);
		employee.setEmpImage(empImage);
		//Giving the product object to DAO layer
		EmployeeDao employeeDao=new EmployeeDao();
		int result=employeeDao.save(employee);
		
		
		if(result==1)
		{
			//to send the data jsp data request to resopnce
			RequestDispatcher dispatcher=request.getRequestDispatcher("employeelist.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text,html");
			PrintWriter writer=response.getWriter();
			writer.println("Data insertion fail check.....");
			RequestDispatcher dispatcher=request.getRequestDispatcher("add_Employee.html");
			dispatcher.include(request, response);
		}
		
}
	}


