package MYSQLPROJECT.Sqlpractice;


import java.sql.*;
public class updatesql {
	static final String DB_URL="jdbc:mysql://localhost:3306/jdb";
    static final String USER="root";
	static final String PASS="Password@12";
	public static void main(String[] args) {
		
		try(Connection con=DriverManager.getConnection(DB_URL,USER,PASS);
			 Statement stmt=con.createStatement();	){
			String sql="select * from  connect";
			String Quer="UPDATE connect SET id=900,name='Lakshmi' where id=400  and name='Lakshmi' ";
			stmt.executeUpdate(Quer);
			System.out.println("the record is inserted into the table");
			ResultSet rs=stmt.executeQuery(sql);
			String Query2="insert into connect values(700,'Suu',82383)";
			stmt.executeUpdate(Query2);
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print("ID: "+rs.getInt("id")+" ");
				System.out.print("NAME: "+rs.getString("name")+ " ");
				System.out.print("SALARY: "+rs.getInt("salary"));
				
				System.out.println();
			}rs.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
