package com.sathya.servlet;
import java.io.InputStream;
import java.sql.Date;
public class Employee {
private String empId;
private String empName;
private double empSalary;
private String empPhono;
private Date empDate;
private byte[] empImage;

public String getEmpId() {
	return empId;
}
public void setEmpId(String empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpPhono() {
	return empPhono;
}
public void setEmpPhono(String empPhono) {
	this.empPhono = empPhono;
}
public Date getEmpDate() {
	return empDate;
}
public void setEmpDate(Date empDate) {
	this.empDate = empDate;
}
public byte[] getEmpImage() {
	return empImage;
}
public void setEmpImage(byte[] empImage) {
	this.empImage = empImage;
}

}
