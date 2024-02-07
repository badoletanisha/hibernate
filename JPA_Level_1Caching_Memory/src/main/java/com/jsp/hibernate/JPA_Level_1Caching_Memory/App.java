package com.jsp.hibernate.JPA_Level_1Caching_Memory;

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
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tanisha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction t = em.getTransaction();
        t.begin();
		Mobile m1 = em.find(Mobile.class,1);
		System.out.println(m1);
		Mobile m2 = em.find(Mobile.class,2);
		System.out.println(m2);
		Mobile m3 = em.find(Mobile.class,3);
		System.out.println(m3);

		t.commit();
//		em.close();
		
		EntityManagerFactory emf2 = Persistence.createEntityManagerFactory("tanisha");
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction t2 = em.getTransaction();
		t2.begin();
		Mobile m4 = em.find(Mobile.class,1);
		System.out.println(m4);
		Mobile m5 = em.find(Mobile.class,3);
		System.out.println(m5);
		Mobile m6 = em.find(Mobile.class,2);
		System.out.println(m6);
		t2.commit();
		em2.close();

	}
}
