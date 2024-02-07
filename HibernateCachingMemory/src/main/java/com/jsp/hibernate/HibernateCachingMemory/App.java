package com.jsp.hibernate.HibernateCachingMemory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg= new Configuration().configure().addAnnotatedClass(Mobile.class);
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        
        Mobile mobile = session.get(Mobile.class, 101);
        session.get(Mobile.class, 102);
        System.out.println(mobile);
        System.out.println(mobile);
        transaction.commit();
        session.close();
//        
    }
}
