package trng.imcs.servelets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/index.jsp")
/**
 * Servlet implementation class VisitorCountServlet
 */
public class VisitorCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private int count;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisitorCountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(){
    	count=0;
    }
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		count++;
		response.setContentType("text/html");
		response.getWriter().append("You are ")
		.append(Integer.toString(count))
		.append("th user visited the page<br>")
		.append("<a href = /EmployeeWebApp/index.html>Go back to Index</a>");
		
	}

}
