package com.jsp.hibernate.onetomanymapping;

import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

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

		Configuration cfg =new Configuration().configure().addAnnotatedClass(Student.class)
				.addAnnotatedClass(Subject.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction trans=session.beginTransaction();


		session.save(s);
		session.save(sub1);
		session.save(sub2);

		trans.commit();
		session.close();


		//    	        Person p = new Person();
		//				p.setpId(01);
		//				p.setpName("Tanisha");
		//		
		//				Vehical v1 = new Vehical();
		//				v1.setvId(21);
		//				v1.setvName("Thar");
		//		
		//				Vehical v2 = new Vehical();
		//				v2.setvId(22);
		//				v2.setvName("BMW");
		//		
		//				p.setVlist(Arrays.asList(v1,v2));
		//		
		//				Configuration cfg = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Vehical.class);
		//				SessionFactory sf=cfg.buildSessionFactory();
		//				Session	session=sf.openSession();
		//				Transaction	trans=session.beginTransaction();
		//		
		//				session.save(p);
		//				session.save(v1);
		//				session.save(v2);
		//				
		//				trans.commit();
		//				session.close();

	}
}
