package mysqlexample2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class mysqlex2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/santhi","root","root");
		System.out.println("connection created with sql database");
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		//excute the select query &strore the data in resultset
		ResultSet set=statement.executeQuery("select * from emp");
		//reading all records background direction
		set.afterLast();
		while(set.previous())
		{
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
			//cursor is last record
			set.last();
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
			//cursor is pointing to first record
			set.first();
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
			// cursor is pointing to specific record
			set.absolute(2);
			System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getFloat(3));
			connection.close();
			System.out.println("connection relesed....");
		}
	}

}
