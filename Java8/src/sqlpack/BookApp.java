package sqlpack;

import java.util.ArrayList;

public class BookApp {

	public static void main(String[] args) {
		
		BookDAO dao = new BookDAO();
		
		ArrayList<Book> b= dao.selectAllBooks();
		
		for(Book x:b)
		{
			System.out.println(x.getId() + " "+x.getName());
		}

	}

}
