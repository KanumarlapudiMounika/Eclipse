package geek;

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

	
	public class GFG extends HttpServlet { 
	  
	    // Getting request response 
	    public void doGet(HttpServletRequest request, 
	                      HttpServletResponse response) 
	        throws ServletException, IOException 
	    { 
	  
	        response.setContentType("text/html"); 
	        PrintWriter out = response.getWriter(); 
	  
	        out.print("welcome to GEEKSFORGEEKS"); 
	  
	        // Closing connections to 
	        // avoid any memory leakage 
	        out.close(); 
	    }
	}
}
    

