package com.jsp.hibernate.JAP_Level_2_caching_Memory;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//      SECOUND LEVEL CACHE MEMORY USING JPA
//***********************************************************************************
        EntityManagerFactory emf =Persistence.createEntityManagerFactory("tanisha");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        
        Mobile mobile1 = em.find(Mobile.class,1 );
		System.out.println(mobile1);
		t.commit();
		em.close();
		
		EntityManagerFactory emf2 =Persistence.createEntityManagerFactory("tanisha");
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction t2 =em2.getTransaction();
		Mobile mobile2 = em2.find(Mobile.class,1);
		System.out.println(mobile2);
		t2.commit();
		em2.close();
    }
}
