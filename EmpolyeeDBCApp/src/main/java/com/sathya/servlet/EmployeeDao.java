package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sathya.servlet.DataBaseUtils;
import com.sathya.servlet.Employee;



public class EmployeeDao {
	public int save(Employee employee)
	{
		int saveResult = 0;
		try(Connection connection=DataBaseUtils.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("insert into Employee_data values(?,?,?,?,?)"))
		{
			preparedStatement.setString(1, employee.getEmpId());
			preparedStatement.setString(2, employee.getEmpName());
			preparedStatement.setDouble(3, employee.getEmpSalary());
			preparedStatement.setString(4,employee.getEmpPhono());
			preparedStatement.setDate(5, employee.getEmpDate());
			saveResult=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return saveResult;
	}
	public List<Employee> getAllEmployees()
	{
		List<Employee> employeelist=new ArrayList<Employee>();
		try(Connection connection=DataBaseUtils.createConnection();
				Statement statement=connection.createStatement())
		{
			ResultSet resultSet=statement.executeQuery("select * from Employee_data");
			while(resultSet.next())
			{
				Employee employee =new Employee();
				employee.setEmpId(resultSet.getString(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setEmpSalary(resultSet.getDouble(3));
				employee.setEmpPhono(resultSet.getString(4));
				employee.setEmpDate(resultSet.getDate(5));
				employee.setEmpImage(resultSet.getBytes("EmpImage"));
				employeelist.add(employee);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employeelist;
	}
	//delete by id
		public int deleteById(String empId)
		{
			int result=0;
			try(Connection connection=DataBaseUtils.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from Employee_data where empId=?"))
					{
						preparedStatement.setString(1, empId);
						result=preparedStatement.executeUpdate();
					}
					catch(SQLException e)
					{
						e.printStackTrace();
					}
			return result;
		}
	
	
	}
	

