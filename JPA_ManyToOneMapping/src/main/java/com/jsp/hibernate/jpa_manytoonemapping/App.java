package com.jsp.hibernate.jpa_manytoonemapping;

import java.util.Arrays;

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
		Owner o = new Owner();
		o.setoId(1001);
		o.setoName("Tanisha");

		House h1 = new House();
		h1.sethId(101);
		h1.sethLoction("Maldives");
		h1.sethRent(50000);
		h1.setOwner(o);

		House h2 = new House();
		h2.sethId(102);
		h2.sethLoction("Denmark");
		h2.sethRent(60000);
		h2.setOwner(o);

		House h3 = new House();
		h3.sethId(103);
		h3.sethLoction("Kenya");
		h3.sethRent(70000);
		h3.setOwner(o);

		House h4 = new House();
		h4.sethId(104);
		h4.sethLoction("Cuba");
		h4.sethRent(80000);
		h4.setOwner(o); 

//		o.sethList(Arrays.asList(h1,h2,h3,h4));
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tanisha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(o);
		em.persist(h1);
		em.persist(h2);
		em.persist(h3);
		em.persist(h4);
		Owner o1=em.find(Owner.class, 1);
		System.out.println(o1);
		House hh1=em.find(House.class, 101);
		System.out.println(hh1);
		House hh2=em.find(House.class, 101);
		System.out.println(hh2);
		House hh3=em.find(House.class, 101);
		System.out.println(hh3);
		House hh4=em.find(House.class, 101);
		System.out.println(hh4);
		et.commit();
	}
}
