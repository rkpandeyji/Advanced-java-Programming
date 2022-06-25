package cal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html"); 
		 PrintWriter out = response.getWriter(); 
		// out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>"); 
		 double n1 = Double.parseDouble(request.getParameter("N1")); 
		 double n2 = Double.parseDouble(request.getParameter("N2")); 
		 double result =0; 

	      
		 
		 String opr=request.getParameter("opr"); 
		 if(opr.equals("+")) result=n1+n2; 
		 //if(opr.equals("-")) result=n1-n2; 
		 if(opr.equals("*")) result=n1*n2; 
		 if(opr.equals("/")) result=n1/n2; 
		 out.println("<h1> Result = "+result); 
		 //out.println("</body></html>");
	}
}


