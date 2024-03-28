package com.sathya.callablestatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class Procedureexceptionexample {

	public static void main(String[] args) throws  SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe:","santhi","santhi");
		
		//call the procedure 
		CallableStatement callablestatement=connection.prepareCall("{call getsal(?,?)}");
		
		//set the data 
		callablestatement.setInt(1, 1002);
		
		//register one variable to store the output
		callablestatement.registerOutParameter(2,Types.FLOAT);
		
		// excute the procdure the output will be stored in registered parameters
		callablestatement.executeUpdate();
		
		//print the out put
		System.out.println(callablestatement.getFloat(2));
		connection.close();
	}
}
