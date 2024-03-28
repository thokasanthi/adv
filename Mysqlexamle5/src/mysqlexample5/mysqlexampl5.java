package mysqlexample5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;

public class mysqlexampl5 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
		System.out.println("connection created with sql database");
		// case1 rowprinting the data dafalut scrolling nature
		Statement statement=connection.createStatement();
		ResultSet set=statement.executeQuery("select * from emp");
		CachedRowSet rowset =RowSetProvider.newFactory().createCachedRowSet();
		// populate the data to rowset
		rowset.populate(set);
		rowset.afterLast();
		while(rowset.previous())
		{
		System.out.println(rowset.getInt(1)+" "+rowset.getString(2)+" "+rowset.getFloat(3));
		}
		connection.close();
		
		
	}
	}


