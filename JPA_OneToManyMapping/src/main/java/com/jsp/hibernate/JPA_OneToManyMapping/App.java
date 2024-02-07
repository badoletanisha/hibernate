package com.jsp.hibernate.JPA_OneToManyMapping;

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
    	Student s = new Student();
		s.setsId(1);
		s.setsName("Tanisha Badole");

		Subject sub1 = new Subject();
		sub1.setSubId(201);
		sub1.setSubName("CSE");

		Subject sub2 = new Subject();
		sub2.setSubId(202);
		sub2.setSubName("Mechenical");
		
		s.setSubList(Arrays.asList(sub1,sub2));
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("tanisha");
		EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	et.begin();
	em.persist(s);
	em.persist(sub1);
	em.persist(sub2);
	Student s1 = em.find(Student.class, 1);
	System.out.println(s1);
	Subject s2 = em.find(Subject.class, 201);
	System.out.println(s2);
	Subject s3 = em.find(Subject.class, 202);
	System.out.println(s3);
	et.commit();
    }
}
