package Mysqlexample4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.DatabaseMetaData;

public class Mysqlex4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
		System.out.println("connection created with sql database");
		DatabaseMetaData metaData =(DatabaseMetaData) connection.getMetaData();
		System.out.println(metaData.getDatabaseProductName());
		System.out.println(metaData.getDatabaseProductVersion());
		System.out.println(metaData.getDriverName());
		System.out.println(metaData.getUserName());
		System.out.println(metaData.getURL());
		connection.close();

	}

}
