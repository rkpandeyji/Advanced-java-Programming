package login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Ind_Ser
 */
@WebServlet("/Ind_Ser")
public class Ind_Ser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ind_Ser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        String name = request.getParameter("fullname");
        String Addr = request.getParameter("address");
        String age = request.getParameter("age");
        String Qual = request.getParameter("qual");
        String Persent = request.getParameter("percent");
        String Year = request.getParameter("yop");
        if (name.isEmpty() || Addr.isEmpty() || age.isEmpty() || Qual.isEmpty() || Persent.isEmpty() || Year.isEmpty())
		{
			   
        	 RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			
			out.println("<font color=red>Please fill all the fields</font>");
			  rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
            rd.forward(request, response);
		}
		
	}

}
