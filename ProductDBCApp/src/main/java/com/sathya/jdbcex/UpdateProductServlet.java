package com.sathya.jdbcex;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Base64;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/UpdateProductServlet")
@MultipartConfig
public class UpdateProductServlet extends HttpServlet {




protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String proId=request.getParameter("proId");
	String updateProductName=request.getParameter("proName");
	double updateProductPrice=Double.parseDouble(request.getParameter("proPrice"));
	String updateProductBrand=request.getParameter("proBrand");
	String  updateProductMadeIn=request.getParameter("proMadeIn");
	Date updateProductMfgDate=Date.valueOf(request.getParameter("proMfgDate"));
	Date updateProductExpDate=Date.valueOf(request.getParameter("proExpDate"));
	
	Product product=new Product();
	product.setProId(proId);
	product.setProName(updateProductName);
	product.setProPrice(updateProductPrice);
	product.setProBrand(updateProductBrand);
	product.setProMadeIn(updateProductMadeIn);
	product.setProMfgDate(updateProductMfgDate);
	product.setProExpDate(updateProductExpDate);
	Part filePart=request.getPart("newProImage");
	// nameproimage is the name of your file input fileld
	if(filePart !=null && filePart.getSize()>0) {
		InputStream inputStream=filePart.getInputStream();
		byte[] newImageData=IOUtils.toByteArray(inputStream);
		product.setProImage(newImageData);
		
	}
	else
	{
		/*Part file=request.getPart("existingImage");
		InputStream inputStream=file.getInputStream();
		byte[] existingImage=IOUtils.toByteArray(inputStream);
		Product product = new Product();
		product.setProImage(existingImage);*/
		String s=request.getParameter("existingImge");
		byte[] existingImge=Base64.getDecoder().decode(s);
		product.setProImage(existingImge);
	}
	String s1=request.getParameter("existinAudio");
	byte[] existingAudio=Base64.getDecoder().decode(s1);
	product.setProAudio(existingAudio);
	String s2=request.getParameter("existingVideo");
	byte[] existingVideo=Base64.getDecoder().decode(s2);
	product.setProVideo(existingVideo);	
	
	
	
	ProductDao dao =new ProductDao();
	int result=dao.updateById(product);
	if(result==1)
	{
		request.setAttribute("updateResult", result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("productList.jsp");
		dispatcher.forward(request, response);
	}
	else
	{
		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("Data Updation fail try check once....."+result);
		RequestDispatcher dispatcher=request.getRequestDispatcher("add_product.html");
		dispatcher.include(request, response);
	}
	}
	
}



