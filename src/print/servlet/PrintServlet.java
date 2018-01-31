package print.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/PrintServlet")
public class PrintServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
      public PrintServlet() {
    	  super();
      }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("firstname");
		
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
        writer.println("<body>");
        if(name != null) {
        writer.println("<h1>Siemka " +name +"!!!</h1>");
        } else {
        	writer.println("<h1>Siemka!!!</h1>");
        }
        
        writer.println("<p> Mi³ego dnia </p>");
        writer.println("</body>");
        writer.println("</html>");
		
		
		
	}


}
