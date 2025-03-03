package packagefilter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.*;

public class oneS extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public oneS() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 response.setContentType("text/html"); 
		PrintWriter out=response.getWriter();
	
		String name=request.getParameter("name");
		String Pass=request.getParameter("password");
	
	
		out.println(name);
		out.println(Pass);
		 out.print("welcome to GEEKSFORGEEKS"); 
		
	}

	
}
