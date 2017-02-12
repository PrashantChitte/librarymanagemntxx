package library.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import libraray.entity.Books;
import library.service.BookOperable;

public class CrudDaoOperationOnBook implements BookOperable{

	public boolean insertBook(Books book, Session ses) {
		if(null!=book)			
		{
			Transaction tx=ses.beginTransaction();
			ses.save(book);
			ses.flush();
			tx.commit();
			ses.close();
			return true;
		}
		else
		{
			System.out.println("Books fields are not complete");
			return false;
		}
		
		
		
	}

	public boolean updateBook(Books book, Session ses, int book_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean removeBook(Books book, Session ses, int book_id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean displayAllBook(Books book, Session ses) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
