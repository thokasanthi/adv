package Mysqlexampl6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class Mysqlex6 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
		System.out.println("connection created with sql database");
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from emp");
		CachedRowSet rowSet= RowSetProvider.newFactory().createCachedRowSet();
		rowSet.populate(set);
		connection.close();
		while(rowSet.next())
		{
			System.out.println(rowSet.getInt(1)+" "+rowSet.getString(2)+" "+rowSet.getFloat(3));
		}

	}

}
