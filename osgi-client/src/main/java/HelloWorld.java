import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet; 
import javax.servlet.*;
import javax.servlet.http.*;
import javax.annotation.Resource;

import com.example.api.SimpleService;

@WebServlet(urlPatterns={"/hello"})
public class HelloWorld extends HttpServlet {

    @Resource(mappedName="decl-service-1")
    SimpleService simpleService;
  
    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws IOException, ServletException {

        
        PrintWriter pw = res.getWriter();
        try {
			pw.println("Service class is " + SimpleService.class + "<br>");
            pw.println("First service is " + simpleService);

            if (simpleService!=null) {
                pw.println("SimpleService says " + simpleService.getString());
                pw.println("<br>");
            }
  		} catch(Exception e) {
        	e.printStackTrace();
        }
    }
}

