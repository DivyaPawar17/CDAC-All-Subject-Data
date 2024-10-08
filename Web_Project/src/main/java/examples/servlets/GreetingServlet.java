package examples.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet(name = "myGreetingServlet", urlPatterns = { "/greet" })
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**-*+
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// This method gets invoked when client makes a request
		//Generating HTML response.
		
		response.setContentType("text/html");//MIME type-Multipurpose
		PrintWriter out = response.getWriter();
		String responseText = "<h1 style='background-color:blue;color:yellow'>Welcome from Servlet</h1>";
		out.println(responseText);
	}

}
