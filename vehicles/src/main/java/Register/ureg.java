package Register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/register")
/**
 * Servlet implementation class ureg
 */
public class ureg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ureg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest rq, HttpServletResponse rs) throws ServletException, IOException {
		String FULLNAME=rq.getParameter("FULLNAME");
		String EMAILID=rq.getParameter("EMAILID");
		String CONTACT=rq.getParameter("CONTACT");
		String PASSWORD=rq.getParameter("PASSWORD");
		rs.setContentType("text/html");
		PrintWriter out=rs.getWriter();
		rg r=new rg();
		try {
			int w=r.getData(FULLNAME, EMAILID, CONTACT, PASSWORD);
			if(w>0) {
				out.println("success");
				rs.sendRedirect("index.jsp");
			}
			else
			{
				out.println("failed try again");
				RequestDispatcher k=rq.getRequestDispatcher("reg.html");
				k.forward(rq, rs);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(FULLNAME);
		out.println(EMAILID);
		out.println(CONTACT);
		out.println(PASSWORD);
	}

}
