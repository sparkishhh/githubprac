package github;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Getcon {
public static Connection getConnection() {
	try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Connection connection= null;
	try {
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db1","root","");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return connection;
	
}
}
