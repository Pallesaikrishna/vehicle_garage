package Register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class rg {
	public static int getData(String FULLNAME,String EMAILID,String CONTACT,String PASSWORD ) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection on=DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets","root","2001");
		PreparedStatement pst=on.prepareStatement("insert into usrg values(?,?,?,?);");
		pst.setString(1, FULLNAME);
		pst.setString(2, EMAILID);
		pst.setString(3, CONTACT);
		pst.setString(4, PASSWORD);
		int rw=pst.executeUpdate();
		on.close();
		pst.close();
		return rw;
	}

}
