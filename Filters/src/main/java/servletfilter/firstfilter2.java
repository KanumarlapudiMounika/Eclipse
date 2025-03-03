package servletfilter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import jakarta.servlet.*;
import java.io.PrintWriter;




public class firstfilter2 extends HttpFilter implements Filter {
	FilterConfig config;
	
    public firstfilter2() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init(FilterConfig Config) throws ServletException {
    	this.config=config;
    	
    }
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String  value=config.getInitParameter("Construction");
		PrintWriter out=response.getWriter();
		if(value.equals("Yes")) {
			out.println("Sorryy");
		}
		else {
		chain.doFilter(request, response);
	}
	}


}
