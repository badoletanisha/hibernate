package com.jsp.hibernate.hqlproject;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.NativeQuery;




public class App 
{
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
	{
		//wahp to print the first nameof the user whose id is max
		//		User u1 = new User();
		//		u1.setUserId(1);
		//		u1.setUserFirstName("Tanisha");
		//		u1.setUserLastName("Badole");
		//		User u2 = new User();
		//		u2.setUserId(2);
		//		u2.setUserFirstName("Jaya");
		//		u2.setUserLastName("Badole");
		//		User u3 = new User();
		//		u3.setUserId(3);
		//		u3.setUserFirstName("Apurva");
		//		u3.setUserLastName("Badole");
		//		User u4 = new User();
		//		u4.setUserId(4);
		//		u4.setUserFirstName("Saroj");
		//		u4.setUserLastName("Badole");
		//		User u5 = new User();
		//		u5.setUserId(5);
		//		u5.setUserFirstName("Arvind");
		//		u5.setUserLastName("Badole");



		Configuration cfg = new Configuration().configure().addAnnotatedClass(User.class);
		SessionFactory sf = cfg.buildSessionFactory(); 
		Session session= sf.openSession();        
		Transaction trans= session.beginTransaction();


		NativeQuery nativeQuery= session.createNativeQuery("select userFirstName from User where userId=(select max(userId) from User)");
		List<String> list = nativeQuery.list();
		for(String  u : list) {
			System.out.println(u);
		}

		//		session.save(u1);
		//		session.save(u2);
		//		session.save(u3);
		//		session.save(u4);
		//		session.save(u5);
		trans.commit();
		session.close();


		//		Fetching ALL the data from DATABASE
		Configuration cfg1 = new Configuration().configure().addAnnotatedClass(Fruits.class);
		SessionFactory sf1 = cfg1.buildSessionFactory(); 
		Session session1= sf1.openSession();        
		Transaction trans1= session1.beginTransaction();

		Query query =session1.createQuery("from Fruits");
		List<Fruits> l =query.getResultList();
		for(Fruits f : l) {
			System.out.println(f);

		}

		//		Query<Object[]> q = session.createQuery("select f.fId,f.fName,f.fPrice from Fruits f");
		//		List <Object[]> list =q.list();
		//		for(Object[] objects : list) {
		//			for(Object object : objects)
		//				System.out.println(object);
		//		}

		//		FECTHING THE DATA USING THE NETIVEQUERY 

		//		NativeQuery nativeQuery = session.createNativeQuery("select * from fruits");
		//		List<Object[]> list = nativeQuery.list();
		//		for(Object[] o:list) {
		//			for(Object obj:o) {
		//				System.out.println(obj);
		//			}
		//		}

		//		                               OR

		//		NativeQuery nativeQuery = session.createNativeQuery("select * from fruits");
		//		List<Object[]> list = nativeQuery.list();
		//		for(Object[] o : list) {
		//			System.out.println(Arrays.deepToString(o));
		//		}

		//		update the data from the database
		//		NativeQuery nativeQuery = session.createNativeQuery("update fruits set fprice=350 where fId=1");
		//		int executeUpdate= nativeQuery.executeUpdate();		
		//		System.out.println(executeUpdate);


		//		delete the data from the database
		//		NativeQuery nativeQuery = session.createNativeQuery("delete from fruits where fId=4 ");
		//		int executeUpdate= nativeQuery.executeUpdate();		
		//		System.out.println(executeUpdate);

		//		insert the data from table
		//		INSERT INTO table_name (column1, column2, column3,etc) VALUES (value1, value2, value3, etc); 
		//		NativeQuery nativeQuery = session.createNativeQuery("Insert into fruits(fId,fName,fPrice)VALUES(4,'Kivi',450) ");
		//		int executeUpdate= nativeQuery.executeUpdate();		
		//		System.out.println(executeUpdate);
		//		 
		//		trans.commit();
		//		session.close();
	}
}



