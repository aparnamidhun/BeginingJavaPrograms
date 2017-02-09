package pack1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Employee")
public class Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("test/html");
		PrintWriter out = response.getWriter();
		final double TAX = 0.1;
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		String salary = request.getParameter("salary");
		
		int salaryamount = Integer.parseInt(salary);
		int intage = Integer.parseInt(age);


			salaryamount = salaryamount+5000;
		
		double tax = salaryamount*TAX;
		double salaryAfterTax = salaryamount*(1-TAX);
		
		out.println("HI "+name+" your tax is "+tax+" and salary after"
				+ "deducting tax is "+salaryAfterTax);
	}

}