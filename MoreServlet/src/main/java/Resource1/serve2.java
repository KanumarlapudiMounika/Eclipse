package Resource1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class serve2
 */
public class serve2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Fname=request.getParameter("Sname");
		String Fpass=request.getParameter("Spass");
		PrintWriter out=response.getWriter();
		out.println(Fname);
		out.println(Fpass);
	}

}
