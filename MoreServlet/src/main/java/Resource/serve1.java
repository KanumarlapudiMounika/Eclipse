package Resource;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.RequestDispatcher;

/**
 * Servlet implementation class serve1
 */
public class serve1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serve1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String Name=request.getParameter("Sname");
		String Pass=request.getParameter("Spass");
		PrintWriter out=response.getWriter();
		
		if(Name.equals("Satya") && Pass.equals("1234")) {
			RequestDispatcher rs=request.getRequestDispatcher("serve2");
			
			rs.forward(request, response);
		}
		else {
			response.setContentType("text/html");
			out.println("Sorry please enter the valid credentials");
			RequestDispatcher rs1=request.getRequestDispatcher("Index.html");
			rs1.include(request, response);
		}
	}

}
