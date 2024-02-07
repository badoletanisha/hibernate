package com.jsp.hibernate.jpa_onetoonemapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Person p1 = new Person();
		p1.setpId(101);
		p1.setpName("Jack");
		p1.setpContact(99999);

		Person p2 = new Person();
		p2.setpId(102);
		p2.setpName("Niel");
		p2.setpContact(88888);
		

		Person p3 = new Person();
		p3.setpId(103);
		p3.setpName("Gems");
		p3.setpContact(77777);
		
		PassPort pass1 = new PassPort(); 
		pass1.setPassPortId(1212);
		pass1.setNameOnPassport("Gems");
		  
		PassPort pass2 = new PassPort(); 
		pass2.setPassPortId(1313);
		pass2.setNameOnPassport("Niel");
		 
 		PassPort pass3 = new PassPort();
		pass3.setPassPortId(1414);
		pass3.setNameOnPassport("Jack");
		
		p1.setPassport(pass1);
		p2.setPassport(pass2);
		p3.setPassport(pass3);
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("tanisha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(pass1);
		em.persist(pass2);
		em.persist(pass3);
		
		 Person p4 = em.find(Person.class, 101);
		 System.out.println(p4);
		 Person p5 = em.find(Person.class, 102);
		 System.out.println(p5);
		 Person p6 = em.find(Person.class, 103);
		 System.out.println(p6);
		 PassPort pp =em.find(PassPort.class,1212);
		 System.out.println(pp);
		 PassPort pp1 =em.find(PassPort.class,1313);
		 System.out.println(pp1);
		 PassPort pp2 =em.find(PassPort.class,1414);
		 System.out.println(pp2);
		 et.commit();
		
    }
}
