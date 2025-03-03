package MYSQLPROJECT.Sqlpractice;
import java.sql.*;

public class Insert {
	static final String DB_URL="jdbc:mysql://localhost:3306/const";
	static final String USER="root";
	static final String PASS="Password@12";
	static final String query="select * from emp";
	public static void main(String[] args) {
		try(Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
				Statement stmt=con.createStatement();){
			
			
			
					String sql="INSERT INTO emp VALUES (200,'Satya',783953,'Bnglr')";
					stmt.executeUpdate(sql);
					System.out.println("Inseted records into the table");
					ResultSet rs=stmt.executeQuery(query);
					while(rs.next()) {
						System.out.print("ID: "+rs.getInt("empid"));
						System.out.print("NAME: "+rs.getString("empname"));
						System.out.print("SALARY: "+rs.getInt("salary"));
						System.out.print("LOC: "+rs.getString("location"));
						System.out.println();
						}
					rs.close();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
	}
}
