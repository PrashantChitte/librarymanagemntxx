package TestAll;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import libraray.entity.Author;
import libraray.entity.Books;
import libraray.entity.Members;

public class TestClass {

	public static void main(String[] args) {
		
		SessionFactory sesfact=new AnnotationConfiguration().configure().buildSessionFactory();
		Session ses= sesfact.openSession();
		Transaction tx=ses.beginTransaction();
		
		
		
		Author a1=new Author();
		a1.setAuth_name("xxx");
		
		Author a2=new Author();
		a2.setAuth_name("yyy");
		
		Members m1=new Members();
		m1.setMember_name("prashant");
		Members m2=new Members();
		m2.setMember_name("Ram");
		
		Books b1=new Books();
		b1.setBook_name("Angipankh");
		b1.setAvail_status("Yes");
	
		Books b2=new Books();
		b2.setBook_name("Jamir");
		b2.setAvail_status("Yes");
		
		b1.setAuthor(a1);
		b1.setMember(m1);		
		b2.setAuthor(a2);
		b2.setMember(m2);
		
		a1.setBook(b1);
		a2.setBook(b2);
		
		m1.setBook(b1);
		m2.setBook(b2);
	
		/*ses.save(a1);
		ses.save(a2);
		
		ses.save(m1);
		ses.save(m2);*/
		
		ses.save(b1);
		ses.save(b2);
		
		ses.flush();
		tx.commit();
		ses.close();
	}

}
