package MYSQLPROJECT.Sqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class deletesql {
	public static void main (String[] args)throws Exception{
		final String DB="jdbc:mysql://localhost:3306/jdb";
		final String USER="root";
		final String PASS="Password@12";
		Connection con=DriverManager.getConnection(DB,USER,PASS);
		Statement stmt=con.createStatement();
		String Query="Delete from connect where id=1000";
		String sql="select * from connect";
		stmt.executeUpdate(Query);
		
		ResultSet rs=stmt.executeQuery(sql);
		while(rs.next()) {
			System.out.println("id: "+rs.getInt("id"));
			System.out.println("name: "+rs.getString("name"));
		}
		rs.close();
		con.close();
		stmt.close();
	}
	
}
