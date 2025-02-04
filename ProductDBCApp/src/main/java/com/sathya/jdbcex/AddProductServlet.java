package com.sathya.jdbcex;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;

@WebServlet("/AddProductServlet")
@MultipartConfig
public class AddProductServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Read the data
		String proId=request.getParameter("proId");
		String proName=request.getParameter("proName");
		Double proPrice=Double.parseDouble(request.getParameter("proPrice"));
		String proBrand=request.getParameter("proBrand");
		String proMadeIn=request.getParameter("proMadeIn");
		Date proMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
		Date proExpDate=Date.valueOf(request.getParameter("proExpDate"));
		Part part=request.getPart("proImage");
		Part part1=request.getPart("proAudio");
		Part part2=request.getPart("proVideo");
		InputStream inputStream=part.getInputStream();
		InputStream inputStream1=part1.getInputStream();
		InputStream inputStream2=part2.getInputStream();
		// converstion of inpustream int byte[]
		byte[] ProImage= IOUtils.toByteArray(inputStream);
		byte[] ProAudio=IOUtils.toByteArray(inputStream1);
		byte[] ProVideo=IOUtils.toByteArray(inputStream2);
		
		//Using above details create the product object
		
		Product product=new Product();
		product.setProId(proId);
		product.setProName(proName);
		product.setProPrice(proPrice);
		product.setProBrand(proBrand);
		product.setProMadeIn(proMadeIn);
		product.setProMfgDate(proMfgDate);
		product.setProExpDate(proExpDate);
		product.setProImage(ProImage);
		product.setProAudio(ProAudio);
		product.setProVideo(ProVideo);
		
		
		
		//Giving the product object to DAO layer
		ProductDao productDao=new ProductDao();
		int result=productDao.save(product);
		
		
		if(result==1)
		{
			System.out.println("Res: "+result);
			//to send the data jsp data request to resopnce
			RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
			dispatcher.forward(request, response);
		}
		else
		{
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("Data insertion fail check.....");
			RequestDispatcher dispatcher=request.getRequestDispatcher("add_product.html");
			dispatcher.include(request, response);
		}
	}	
		
	
	

}
