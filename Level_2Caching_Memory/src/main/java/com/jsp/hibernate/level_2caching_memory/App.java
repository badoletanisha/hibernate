package com.jsp.hibernate.level_2caching_memory;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
//                    SECOUND LEVEL CACHE MEMORY
//***********************************************************************************
    	
    	Configuration cfg=new Configuration().configure().addAnnotatedClass(Mobile.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session1 = sessionFactory.openSession();
		Transaction transaction1 = session1.beginTransaction();

		Mobile mobile1 = session1.get(Mobile.class,1 );
		System.out.println(mobile1);
		transaction1.commit();
		session1.close();

		Session session2 = sessionFactory.openSession();
		Transaction transaction2 =session2.beginTransaction();
		Mobile mobile2 = session2.get(Mobile.class,1);
		System.out.println(mobile2);
		transaction2.commit();
		session2.close();

    }
}
