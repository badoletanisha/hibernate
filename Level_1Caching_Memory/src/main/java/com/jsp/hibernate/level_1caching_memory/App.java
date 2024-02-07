package com.jsp.hibernate.level_1caching_memory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
		//    	               FIRST LEVEL CACHE MEMORY
		//***********************************************************************************
		       Configuration cfg=new Configuration().configure().addAnnotatedClass(Mobile.class);
		       SessionFactory sessionFactory = cfg.buildSessionFactory();
		       Session session = sessionFactory.openSession();
		       Transaction transaction = session.beginTransaction();
		       
		       Mobile mobile1 = session.get(Mobile.class,104 );
		       System.out.println(mobile1);
		       Mobile mobile2 = session.get(Mobile.class,104 );
		       System.out.println(mobile2);
		       Mobile mobile3 = session.get(Mobile.class,101 );
		       System.out.println(mobile3);
		       Mobile mobile4 = session.get(Mobile.class,106 );
		       System.out.println(mobile4);
		       
		       transaction.commit();
		       session.close();
		       
		       Session session2 = sessionFactory.openSession();
		       Transaction transaction2 = session2.beginTransaction();
		       Mobile mobile5 = session2.get(Mobile.class,105 );
		       System.out.println(mobile5);
		       Mobile mobile6 = session2.get(Mobile.class,101 );
		       System.out.println(mobile6);
		       Mobile mobile7 = session2.get(Mobile.class,101 );
		       System.out.println(mobile7);
		       Mobile mobile8 = session2.get(Mobile.class,106 );
		       System.out.println(mobile8);

		       transaction2.commit();
		       session2.close();

		
//********************************************************************************************************
		















	}
}
