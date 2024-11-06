package login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/sk")
/**
 * Servlet implementation class login
 */
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String EMAILID=rq.getParameter("EMAILID");
		String PASSWORD=rq.getParameter("PASSWORD");
		rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		lg l=new lg();
		try {
			ResultSet m=l.getData(EMAILID, PASSWORD);
			if(m.next())
			{
				out.println("logged in");
				out.println("<h1> please select your option<h1>");
				rs.sendRedirect("new.jsp");
				
			}
			else
			{
				out.println("please try again");
				RequestDispatcher d=rq.getRequestDispatcher("index.jsp");
				d.include(rq, rs);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println("rror");
		
	}

}
