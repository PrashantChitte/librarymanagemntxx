package library.service;

import org.hibernate.Session;

import libraray.entity.Books;

public interface BookOperable {

	public boolean insertBook(Books book,Session ses);
	public boolean updateBook(Books book,Session ses,int book_id);
	public boolean removeBook(Books book,Session ses,int book_id);
	public boolean displayAllBook(Books book,Session ses);
	
}

