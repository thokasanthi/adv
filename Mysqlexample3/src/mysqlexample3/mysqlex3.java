package mysqlexample3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.protocol.Resultset;

public class mysqlex3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// data load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//create connection
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
		System.out.println("connection created with sql database");
		// using connection statement
		Statement statement=connection.createStatement();
		//excute the select query &strore the data in resultset);
		ResultSet resultset=statement.executeQuery("select * from emp");
		//using resultset create resultset metadata object
		ResultSet  metaData=(ResultSet) resultset.getMetaData();
		System.out.println(metaData.get);
		
		connection.close();

	}

}
