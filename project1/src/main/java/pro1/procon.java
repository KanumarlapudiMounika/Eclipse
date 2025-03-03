package pro1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Servlet implementation class procon
 */
public class procon extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public procon() {
        super();
        // TODO Auto-generated constructor stub
    }

	/*
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		public class Dao {
			Dao(){
				
			}
			public static Dao conn(){
				try {
			String url="jdbc:mysql://localhost:8080//user";
			String username="root";
			String passwords="Password@12";
			Connection con=DriverManager.getConnection(url,username,passwords);
			
				}
				catch(Exception e) {
					e.getMessage();
				}
				return new Dao();
		}
		}
	}
*/
}
