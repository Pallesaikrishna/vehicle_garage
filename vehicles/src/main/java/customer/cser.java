package customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/customer")
/**
 * Servlet implementation class cser
 */
public class cser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cser() {
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
	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fullname=rq.getParameter("fullname");
		String email=rq.getParameter("email");
		String address=rq.getParameter("address");
		String mobile=rq.getParameter("mobile");
		String modelname=rq.getParameter("modelname");
		rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		out.println("fullname");
		out.println("email");
		out.println("address");
		out.println("mobile");
		out.println("modelname");
	}

}
