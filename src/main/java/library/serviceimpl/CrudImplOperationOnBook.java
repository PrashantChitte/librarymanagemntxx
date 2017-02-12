package library.serviceimpl;

import org.hibernate.Session;

import libraray.entity.Author;
import libraray.entity.Books;
import libraray.entity.Members;
import library.daoimpl.CrudDaoOperationOnBook;
import library.service.BookOperable;

public class CrudImplOperationOnBook implements BookOperable {

	public boolean insertBook(Books book, Session ses) {
		Author a1=new Author();
		a1.setAuth_name("xxx");				
		
		Members m1=new Members();
		m1.setMember_name("prashant");				
		Books b1=new Books();
		b1.setBook_name("Angipankh");
		b1.setAvail_status("Yes");			
		
		b1.setAuthor(a1);
		b1.setMember(m1);		
		
		a1.setBook(b1);		
		
		m1.setBook(b1);
		
		boolean insert=new CrudDaoOperationOnBook().insertBook(b1,ses);
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
		// call to Dao class method use set to object and display all data here
		return false;
	}

	
}
