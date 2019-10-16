package org.customer.app.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;;

public class MyHbSqlConnection {
	
	private static Connection connection =null;
	private MyHbSqlConnection() throws SQLException{
		connection=DriverManager.getConnection("jdbc:hsqldb;sample","SA","");
	}

	public static Connection getMyConnection() {
		if(connection==null) {
			new MyHbsqlConnection();
		}
		return connection;
	}
}
