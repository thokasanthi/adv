package mysqlexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqlex1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
	System.out.println("connection created with sql database");
	PreparedStatement preparedStatement=connection.prepareStatement("insert emp values(?,?,?)");
	preparedStatement.setInt(1, 111);
	preparedStatement.setString(2, "santhi");
	preparedStatement.setFloat(3, 20000.45f);
	preparedStatement.addBatch();
	preparedStatement.setInt(1, 222);
	preparedStatement.setString(2, "anu");
	preparedStatement.setFloat(3, 30000.45f);
	preparedStatement.addBatch();
	preparedStatement.setInt(1, 333);
	preparedStatement.setString(2, "anil");
	preparedStatement.setFloat(3, 30000.45f);
	preparedStatement.addBatch();
	preparedStatement.executeBatch();
	connection.close();
	System.out.println("connection released......");
		}

	}

