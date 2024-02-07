package com.jsp.hibernate.Mapping;

//import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;
public class App 
{
	public static void main( String[] args )
	{
		// Owner and House class code
		/*
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
				o.setHlist(Arrays.asList(h1,h2,h3,h4));
		 */
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Owner.class).addAnnotatedClass(House.class);
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session session= sf.openSession();        
		Transaction trans= session.beginTransaction();



		//		WE CAN ONLY FETCH THE DATA OF SINGLE PERSON FROM THE DATABASE
		House h=session.get(House.class, 101);
		System.out.println(h);

		//		 CREATE EXCEPTION WITH THE HELP OF LOAD METHOD
//		House h=session.load(House.class, 108);
//		System.out.println(h);

//		session.save(o);
//		session.save(h1);
//		session.save(h2);
//		session.save(h3);
//		session.save(h4);




		trans.commit();
		session.close();




	}
}


