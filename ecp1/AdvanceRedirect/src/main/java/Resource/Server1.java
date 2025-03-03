package Resource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Server1
 */
@WebServlet("/Server1")
public class Server1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("Sname");
		//String m=request.getParameter("Spass");
		PrintWriter pw=response.getWriter();
		pw.println("<a href='servlet2?uname="+s+"'>Click</a>");
		pw.println(request.getParameter("Spass"));
		pw.close();
	}

}
