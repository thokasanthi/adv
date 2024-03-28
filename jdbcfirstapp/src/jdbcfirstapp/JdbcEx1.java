
package jdbcfirstapp;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;
public class JdbcEx1 {

	
	public static void main(String[] args) throws  ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		//step-1 Load the driver
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Loaded Successfully... ");
		//step-2 create the connection
				Connection Connection=DriverManager.getConnection
						("jdbc:oracle:thin:@localhost:1521:xe","santhi","santhi");
				System.out.println("connection creadted Successfully...");
				//step-3 static query execution
				Statement  statement1=Connection.createStatement();
				String q1="create table emp2(emp2id number(10),emp2name varchar2(30),emp2salary number(10,2))";
				int res1=statement1.executeUpdate(q1);
				System.out.println("table created sucessfull..."+res1);
				String q2="drop table  emp2";
				int res2=statement1.executeUpdate(q2);
				System.out.println("table created successfully"+res2);
				
				//step-4 Release the connection
				Connection.close();
				System.out.println("connection close Successfully...");
				
				
		
	}

	
}
