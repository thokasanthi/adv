package Jdbcproduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbcsecond.Dbconnection;

public class ProductDao {
	
	
	public int save(ProductDao productDao) 
	{
		
			Connection connection=null;
			PreparedStatement preparedStatement=null;
			int count=0;
			try
			{
				connection=Dbconnection.createConnection();
				preparedStatement=connection.prepareStatement("insert into product values(?,?,?)");
				preparedStatement.setInt(1,product.getProid());
				preparedStatement.setString(2,Product.getProname());
				preparedStatement.setDouble(3,Product.getProprice());
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
		public Product findById(int proid)
		{
			Product product=null;
			try(Connection connection=Dbconnection.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("select * from product where proid=?"))
			{
				preparedStatement.setInt(1, proid);
				ResultSet resultSet = preparedStatement.executeQuery();
				
				if(resultSet.next())
				{
					product =new Product();
					product.setProid(resultSet.getInt(1));
					product.setProname(resultSet.getString(2));
					product.setProprice(resultSet.getDouble(3));
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return product;
		}
		
		public int deleteById(int proid)
		{
			int count =0;
			try(Connection connection=Dbconnection.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from product where proid=?"))
			{
				preparedStatement.setInt(1, proid);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
		
		public int deleteBySalary(double proprice)
		{
			int count =0;
			try(Connection connection=Dbconnection.createConnection();
					PreparedStatement preparedStatement=connection.prepareStatement("delete from product where proprice>?"))
			{
				preparedStatement.setDouble(1, proprice);
				count=preparedStatement.executeUpdate();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return count;
		}
		
			
		}
	


