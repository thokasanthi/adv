package jdbctransction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbctranctionex1 {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection=null;
		Statement statement=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","santhi","santhi");
			statement=connection.createStatement();
			connection.setAutoCommit(false);
			statement.executeUpdate("insert into emp1 values(1002,'santhi',20000.45)");
			statement.executeUpdate("insert into emp1 values(1003,'sravani',10000.45)");
			statement.executeUpdate("insert into emp1 values(1004,'anusha',25000.45)");
			statement.executeUpdate("delete from emp1 where empid=1002");
			connection.commit();
			System.out.println("transction is successfully...");
		}
		catch(ClassNotFoundException|SQLException e)
		{
			connection.rollback();
			e.printStackTrace();
			System.out.println("transction fail...");
		}
		finally
		{
			if(statement!=null) 
				statement.close();
			if(connection!=null) connection.close();
		}

	}




	}



