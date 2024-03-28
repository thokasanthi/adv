
package jdbcsecond;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {
	public int save(Employee emp) 
	{
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int count=0;
		try
		{
			connection=Dbconnection.createConnection();
			preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
			preparedStatement.setInt(1,emp.getEmpId());
			preparedStatement.setString(2,emp.getEmpName());
			preparedStatement.setDouble(3,emp.getEmpSalary());
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException s)
		{
			s.printStackTrace();
		}
		finally
		{
			try
			{
				if(connection!=null)
					connection.close();
				if(preparedStatement!=null)
					preparedStatement.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		return count;
	}
	public Employee findById(int empId)
	{
		Employee employee=null;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("select * from emp where empId=?"))
		{
			preparedStatement.setInt(1, empId);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next())
			{
				employee =new Employee();
				employee.setEmpId(resultSet.getInt(1));
				employee.setEmpName(resultSet.getString(2));
				employee.setEmpSalary(resultSet.getDouble(3));
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return employee;
	}
	
	public int deleteById(int empId)
	{
		int count =0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empId=?"))
		{
			preparedStatement.setInt(1, empId);
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	
	public int deleteBySalary(double empSalary)
	{
		int count =0;
		try(Connection connection=Dbconnection.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement("delete from emp where empSalary>?"))
		{
			preparedStatement.setDouble(1, empSalary);
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return count;
	}
	//findAll
	public List<Employee>findAll(){
		// create the list to store the group of records
		List<Employee>emps=new ArrayList<Employee>();
		    try
		    {
			    Connection connection=Dbconnection.createConnection();
			    Statement Statement=connection.createStatement();
			     ResultSet resultSet=Statement.executeQuery("select*from emp");
			// while loop reading all the values one by one
			     while(resultSet.next())
			    	 {
				// read the data from resultset set to emp
			    	 Employee employee=new Employee();
			    	  employee.setEmpId(resultSet.getInt(1));
					  employee.setEmpName(resultSet.getString(2));
		              employee.setEmpSalary(resultSet.getDouble(3));
		        
					// add employee object in to list
		              emps.add(employee);
			         } 
		    }
			catch(SQLException e)
			{
				e.printStackTrace();
			}
	return emps;
	}
	  //update salary
	public int UpadateSalary(double currentSalary,double incSalary) {
	int updatecount=0;
	        try
	        {
		     Connection connection=Dbconnection.createConnection();
		     PreparedStatement preparedStatement=connection.prepareStatement("update emp set empSalary=empSalary+? where empSalary>?");
		     preparedStatement.setDouble(1, incSalary);
		     preparedStatement.setDouble(2, currentSalary);
		     updatecount=preparedStatement.executeUpdate();
	        }
	        catch(SQLException e)
			{
				e.printStackTrace();
			}
	return updatecount;
		
	}
}


