package trng.imcs.servelets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import trng.imcs.model.Employee;
import trng.imcs.services.EmployeeOperations;

/**
 * Servlet implementation class EmployeeSearchServlet
 */
public class EmployeeSearchServlet extends HttpServlet {
	private EmployeeOperations operations = new EmployeeOperations();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeSearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp = operations.getEmployee(Integer.parseInt(request.getParameter("empNo")));
		response.setContentType("text/html");
		response.getWriter().append("<Html><body>")
							.append("Employee Number: " + emp.getNumber() + "<br>")
							.append("First Name: " + emp.getFirstName()+ "<br>")
							.append("Last Name: " + emp.getLastName()+ "<br>")
							.append("Salary: " + emp.getSalary()+ "<br>")
							.append("Dept Name: " + emp.getDeptName()+ "<br>")
							.append("Response received from doGet method<br>")
							.append("<a href = /EmployeeWebApp/index.html>Go back to Index</a>");;
	}

}
