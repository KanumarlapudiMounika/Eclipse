package geek;
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
// Class 
// Implementing Filter class 
public class firstfilter implements Filter { 

	public void init(FilterConfig arg0) 
		throws ServletException 
	{ 
	} 

	public void doFilter(ServletRequest req, 
						ServletResponse resp, 
						FilterChain chain) 
		throws IOException, ServletException 
	{ 

		PrintWriter out = resp.getWriter(); 

		String password = req.getParameter("password"); 

		if (password.equals("geeksforgeeks")) { 

			// Sending request to next 
			chain.doFilter(req, resp); 
		} 

		// Password incorrect 
		else { 
			out.print("username or password is wrong"); 
			RequestDispatcher rd 
				= req.getRequestDispatcher("index.html"); 
			rd.include(req, resp); 
		} 
	} 
	public void destroy() {} 
}
