package packagefilter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class oneF
 */
public class oneF extends HttpFilter implements Filter {
       
	 public void init(FilterConfig arg0) 
		        throws ServletException 
		    { 
		    } 
	
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int pass=Integer.parseInt(request.getParameter("password"));
		int check=1234;
		if(pass == check) {
			
			chain.doFilter(request, response);
			
		}
		else {
				
			out.println("Sorryyy");
			RequestDispatcher rd=request.getRequestDispatcher("pass.html");
			rd.include(request, response);
			
		}
		
	} public void destroy() {} 
}

	
	

