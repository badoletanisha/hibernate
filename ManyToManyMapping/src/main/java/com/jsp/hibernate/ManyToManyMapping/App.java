package com.jsp.hibernate.ManyToManyMapping;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Cart c1 = new Cart();
		c1.setcId(101);
		c1.setcCapacity(5000);
		
		Cart c2 = new Cart();
		c2.setcId(102);
		c2.setcCapacity(6000);
		
		Cart c3 = new Cart();
		c3.setcId(103);
		c3.setcCapacity(7000);
		
		Item i1 = new Item();
		i1.setiId(1);
		i1.setiName("Iphone");
		i1.setiPrice(80000);
		
		Item i2 = new Item();
		i2.setiId(2);
		i2.setiName("OnePlus");
		i2.setiPrice(60000);
		
		Item i3 = new Item();
		i3.setiId(3);
		i3.setiName("samsung");
		i3.setiPrice(70000);
		
		c1.setItemsList(Arrays.asList(i1,i2,i3));
		c2.setItemsList(Arrays.asList(i1,i2,i3));
		c3.setItemsList(Arrays.asList(i1,i2,i3));
		
		i1.setCartList(Arrays.asList(c1,c2,c3));
		i2.setCartList(Arrays.asList(c1,c2,c3));
        i3.setCartList(Arrays.asList(c1,c2,c3));

        Configuration cfg = new Configuration().configure().addAnnotatedClass(Cart.class).addAnnotatedClass(Item.class);
    	SessionFactory sf =	cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		session.save(c3);
		session.save(i1);
		session.save(i2);
		session.save(i3);

    	
    	
   
//		        Student student1 = new Student();
//				student1.setStudentId(1);
//				student1.setStudentName("Tanisha");
//		
//				Student student2 = new Student();
//				student2.setStudentId(2);
//				student2.setStudentName("Sujal");
//		
//				Student student3 = new Student();
//				student3.setStudentId(3);
//				student3.setStudentName("Jaya");
//		
//				Course course1 = new Course();		
//				course1.setCourseId(801);
//				course1.setCourseName("CSE");
//		
//		
//				Course course2 = new Course();		
//				course2.setCourseId(802);
//				course2.setCourseName("IT");
//		
//				Course course3 = new Course();		
//				course3.setCourseId(803);
//				course3.setCourseName("Mechenical");
//		
//				course1.setStudentList(Arrays.asList(student1,student2,student3));
//				course2.setStudentList(Arrays.asList(student1,student2,student3));
//				course3.setStudentList(Arrays.asList(student1,student2,student3));
//				
//				student1.setCourseList(Arrays.asList(course1,course2,course3));
//		
//				Configuration cfg=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Course.class);
//				SessionFactory sf = cfg.buildSessionFactory();
//				Session session=sf.openSession();
//				Transaction trans = session.beginTransaction();
//		
//		
//				session.save(student1);
//				session.save(student2);
//				session.save(student3);
//				session.save(course1);
//				session.save(course2);
//				session.save(course3);
//				
				trans.commit();
				session.close();
//
    }
}
