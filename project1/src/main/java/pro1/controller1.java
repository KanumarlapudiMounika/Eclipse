package pro1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import jakarta.servlet.RequestDispatcher;


public class controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String url="jdbc:mysql://localhost:3306://user";       
	String username="root";
	String Mpass="Password@12";
	public controller1() 
	{
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String uname = request.getParameter("uname");
		String pass = request.getParameter("upass");
		String sql="select * from credentials where name='uname' and password='pass' ";
	
	
		PrintWriter out = response.getWriter();
		
			try {
				 Class.forName( "com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection(url,username,Mpass);
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, uname);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				int count=0;
				if(rs.next()) {
					response.setContentType("type/html");
					RequestDispatcher rd=request.getRequestDispatcher("index.html");
					rd.include(request, response);
					out.println("Successs");
				}
				con.close();
				ps.close();
				rs.close();
			}
			catch(Exception e) {
				out.println(e.getMessage());
			}
		
			
	}
}
