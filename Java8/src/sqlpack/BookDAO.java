package sqlpack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	
	public ArrayList selectAllBooks()
	{
		ArrayList<Book> books = new ArrayList<Book>();
		Connection c = DbClass.getConnection();
		Statement stmt = null;
		try {
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from book");
			
			while(rs.next())
			{
				Book b = new Book(rs.getInt(1), rs.getString(2));
				books.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
			try {
				stmt.close();
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		return  books;
	}
}
