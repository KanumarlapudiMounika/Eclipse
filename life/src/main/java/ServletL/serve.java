package ServletL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.ServletConfig;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.GenericServlet;



public class serve extends GenericServlet {
	private static final long serialVersionUID = 1L;
       public int count;
       public void innit(ServletConfig sc) {
    	   count=Integer.parseInt(sc.getInitParameter("count"));
       }
       
 @Override  
       public void service(ServletRequest req,ServletResponse res)throws ServletException, IOException{
    	   PrintWriter pw=res.getWriter();
    	   res.setContentType("text/html");
    	   pw.println("<html>"+"<body>");
    	   pw.println("<h2>value of count :</h2>"+count);
    	   pw.println("</html>"+"</body>");
    	   pw.close();
       }
       public void destroy() {
       }
	}


