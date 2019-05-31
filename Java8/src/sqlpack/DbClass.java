package sqlpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbClass {

	public static Connection getConnection()
	{
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jothi","jothi2");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
}
