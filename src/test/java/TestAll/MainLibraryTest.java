package TestAll;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import libraray.entity.Author;
import libraray.entity.Books;
import libraray.entity.Members;
import libraray.utility.ConnectionClass;
import library.serviceimpl.CrudImplOperationOnBook;

public class MainLibraryTest {

	public static void main(String[] args) {
		
		Session ses=ConnectionClass.getConnectionObject().openSession();
		Scanner sc=new Scanner(System.in);
				
		CrudImplOperationOnBook crudImplOper=null;
		Books book=null;
		char ans;
		
	     do
	      {
	    	 
	 		 int choice;
	 		System.out.println("1)Insert Book");
	 		System.out.println("2)Update Book");
	 		System.out.println("3)Remove Book");
	 		System.out.println("4)Display All Book");
	 		System.out.println("5)Exit");
	    	choice=sc.nextInt();
	    	 
			switch (choice) {
			case 1:
				String authName;
				String memName;
				String bookName;
				String bookAvail;
				
				crudImplOper=new CrudImplOperationOnBook();
				
				Members m1=new Members();
				Author a1=new Author();
				Books b1=new Books();
				System.out.println("Enter author name:");
				authName=sc.next();
				a1.setAuth_name(authName);				
				System.out.println("Enter book name:");
				bookName=sc.next();
				b1.setBook_name(bookName);
				System.out.println("Enter member name:");
				memName=sc.next();
				m1.setMember_name(memName);				
				System.out.println("Enter availability of Book(yes/no)");
				bookAvail=sc.next();
				b1.setAvail_status(bookAvail);			
				
				b1.setAuthor(a1);
				b1.setMember(m1);		
				
				a1.setBook(b1);		
				
				m1.setBook(null);
				crudImplOper.insertBook(b1, ses);
				break;
			case 2:
				 crudImplOper=new CrudImplOperationOnBook();
				 /*Supriya's Task update book
				 	send NULL Book and book_ID from this case
				    */
				 System.out.println("Enter book id for upadte book:");
				 int bookid=sc.nextInt();				 				 				 
				 crudImplOper.updateBook(book, ses, bookid);
				break;
			case 3:
				crudImplOper=new CrudImplOperationOnBook();
				//Pravin's Task remove book
				//send NULL Book and book id from this case
				//crudImplOper.removeBook(book, ses, book_id);
				break;
			case 4:
				crudImplOper=new CrudImplOperationOnBook();
				//Suhas's Task display all books
				// send NULL Book and from this case
				crudImplOper.displayAllBook(book, ses);
				break;
			case 5:
				break;			
			default:
				System.out.println("no such operation");
			}
	     System.out.println("Do you want to Continue:");        
         ans=(char) sc.next().charAt(0);	     	           
	   }while('y'==ans || 'Y'==ans);

		
		
		
		
		
	}
}
