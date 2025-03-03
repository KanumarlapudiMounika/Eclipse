package packagefilter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;


public class twoF extends HttpFilter implements Filter {
	FilterConfig config;
    public twoF() {
      
    }

    public void init(FilterConfig config) throws ServletException {
		
		  this.config=config;
	}
    
	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String  value=config.getInitParameter("OTP");
		//String password=request.getParameter("password");
		PrintWriter out=response.getWriter();
		if(password.equals("12345")) {
			out.println("Sorryy");
		}
		else {
		chain.doFilter(request, response);
	}
	}

	
	

}
