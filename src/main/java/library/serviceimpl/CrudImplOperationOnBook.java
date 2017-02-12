package library.serviceimpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import libraray.entity.Author;
import libraray.entity.Books;
import libraray.entity.Members;
import library.daoimpl.CrudDaoOperationOnBook;
import library.service.BookOperable;

public class CrudImplOperationOnBook implements BookOperable {

	public boolean insertBook(Books book, Session ses) {
		
		boolean insert=new CrudDaoOperationOnBook().insertBook(book,ses);
		System.out.println("Book Record Saved");
		
		return insert;
	}

	public boolean updateBook(Books book, Session ses, int book_id) {
		//retrive book here update here and send same id and book to daoclass method to save 
		//call to Dao class method
		
		
		return false;
	}

	public boolean removeBook(Books book, Session ses, int book_id) {
		//
		// call to Daoclass method for remove book on  id 
		return false;
	}

	public boolean displayAllBook(Books book, Session ses) {		
		Transaction transaction = ses.beginTransaction();
		Query query=ses.createQuery("from Books");
		List<Books> listOfBooks =query.list();  
		for (Books books : listOfBooks) {
			System.out.println(books.getBook_id() + " " + books.getBook_name() + " " + books.getAuthor().getAuth_name() + " "
					+ books.getMember().getMember_name() + " " + books.getAvail_status());
		}				
		transaction.commit();

		return false;
	}

	
}
