package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class lg {
public static ResultSet getData(String EMAILID,String PASSWORD) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets","root","2001");
	PreparedStatement ps=n.prepareStatement("select * from usrg where EMAILID=? and PASSWORD=?");
	ps.setString(1, EMAILID);
	ps.setString(2, PASSWORD);
	return ps.executeQuery();
}
}