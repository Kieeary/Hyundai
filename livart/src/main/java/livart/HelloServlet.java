package livart;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	
	 protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	        System.out.println("HelloServlet.service");
	        System.out.println("request = " + request);
	        System.out.println("response = " + response);

	        String username= request.getParameter("username");
	        System.out.println("username = " + username);
	    }
}
