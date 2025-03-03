package filterpackage;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;


public class filter1 extends HttpFilter implements Filter {
       
    FilterConfig config;
    public filter1() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void init(FilterConfig fConfig) throws ServletException {
		this.config=config;
	}
    
    
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html");
		String sname=request.getParameter("username");
		String spass=request.get
		chain.doFilter(request, response);
	}

	
	

}
