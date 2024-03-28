package Loginname;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/name")
public class name extends HttpServlet {

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//step-1:read the form data
		String Firstname=request.getParameter("Firstname");
		String Middlename=request.getParameter("Middlename");
		String Lastname=request.getParameter("Lastname");
		//step-2:process the data
		String status;
			status = Firstname+" "+Middlename+" "+Lastname;
			
		PrintWriter writer=response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>Login name...</h1>"+status);
		writer.println("</html>");
	
		
	
		
	}
}
