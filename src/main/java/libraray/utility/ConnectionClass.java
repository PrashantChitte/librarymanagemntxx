package libraray.utility;

import java.sql.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class ConnectionClass {

	public static SessionFactory getConnectionObject()
	{
		SessionFactory sesfact=new AnnotationConfiguration().configure().buildSessionFactory();		
		return sesfact;
		
		
		
	}
	
	
}
