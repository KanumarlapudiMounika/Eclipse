package MYSQLPROJECT.Sqlpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class insertsql {
	

	static final String DB_URL="jdbc:mysql://localhost:3306/jdb";
    static final String USER="root";
	static final String PASS="Password@12";
	public static void main(String[] args) {
		
		try(Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt=con.createStatement();	){
			String Query="select * from  connect";
			String sql="insert into connect values(100,'satya',283648),(200,'mounika',23423),(300,'kanu',325929),(400,'sreenu',25235)";
			stmt.executeUpdate(sql);
			System.out.println("the record is inserted into the table");
			ResultSet rs=stmt.executeQuery(Query);
			
			while(rs.next()) {
				System.out.print("ID: "+rs.getInt("id")+"\n");
				System.out.print("NAME: "+rs.getString("name"));
				System.out.print("SALARY: "+rs.getInt("salary"));
				
				System.out.println();
			}rs.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

}
}