package pro1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.lang.Exception;

public class Dao {
	static Connection c;
	Dao(){
		
	}
	public static Connection conn(){
		try {
	String url="jdbc:mysql://localhost:8080//user";
	String username="root";
	String passwords="Password@12";
	c=DriverManager.getConnection(url,username,passwords);
	
		}
		catch(Exception e) {
			e.getMessage();
		}
		return c;
}
}
