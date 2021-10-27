import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyServletDemo extends HttpServlet {
	private String mymsg;
	
	// initializes message
	public void init() throws ServletException {
		mymsg = "Hell Yeah World!";
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");	// setting up html webpage
		PrintWriter out = response.getWriter();	// writing msg to webpage
		out.println("<h1>" + mymsg + "</h1>");
	}
	
	public void destroy() {
		
	}
}
