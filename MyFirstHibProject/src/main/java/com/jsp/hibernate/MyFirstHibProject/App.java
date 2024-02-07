package com.jsp.hibernate.MyFirstHibProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
	public static void main( String[] args )
	{
//		person passport,pan code
//		
//     	Person p1 = new Person();
//		p1.setpId(101);
//		p1.setpName("Jack");
//		p1.setpContact(99999);
//
//		Person p2 = new Person();
//		p2.setpId(102);
//		p2.setpName("Niel");
//		p2.setpContact(88888);
//
//		Person p3 = new Person();
//		p3.setpId(103);
//		p3.setpName("Gems");
//		p3.setpContact(77777);

//		PersonPan pan1 = new PersonPan();
//		pan1.setPanId(2130);
//    	pan1.setNameOnPan("Jack");
//		pan1.setLocOnPan("UK");
//
//		PersonPan pan2 = new PersonPan();
//		pan2.setPanId(3140);
//		pan2.setNameOnPan("Niel");
//		pan2.setLocOnPan("UK");
//
//		PersonPan pan3 = new PersonPan();
//		pan3.setPanId(4150);
//		pan3.setNameOnPan("gems");
//		pan3.setLocOnPan("UK");

//	   PassPort pass1 = new PassPort(); 
//	   pass1.setPassPortId(1212);
//	   pass1.setNameOnPassport("Gems");
//
//   	   PassPort pass2 = new PassPort(); 
//	   pass2.setPassPortId(1313);
//	   pass1.setNameOnPassport("Niel");
//
//   	   PassPort pass3 = new PassPort();
//	   pass3.setPassPortId(1414);
//	   pass3.setNameOnPassport("Jack");

//		p1.setPersonPan(pan1);
//		p2.setPersonPan(pan2);
//		p3.setPersonPan(pan3);

//		p1.setPassport(pass1);
//		p2.setPassport(pass2);
//		p3.setPassport(pass3);
//
//	  	SessionFactory sf = new Configuration().configure().addAnnotatedClass(PassPort.class)
//	  			.addAnnotatedClass(Person.class).addAnnotatedClass(PersonPan.class).buildSessionFactory();
//		Session session =sf.openSession();
//		Transaction trans = session.beginTransaction();

//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(pan1);
//		session.save(pan2);
//		session.save(pan3);
//		session.save(pass1);
//		session.save(pass2);
//		session.save(pass3);
//
//		trans.commit();
//			session.close();
			
			
//		 ****************************************************************************
//               company employee code

//				Company c = new Company();
//		        c.setcId(10);
//		        c.setcName("Microsoft");
//
//		        Employee e1 = new Employee();
//				e1.setEmpId(101);
//				e1.setEmpName("Jaya");
//				e1.setEmpSal(670000);
//				e1.setCompany(c);
//				Employee e2 = new Employee();
//				e2.setEmpId(102);
//				e2.setEmpName("Sujal");
//				e2.setEmpSal(70000);
//				e2.setCompany(c);
//				Employee e3 = new Employee();
//				e3.setEmpId(103);
//				e3.setEmpName("Apurva");
//				e3.setEmpSal(60000);
//				e3.setCompany(c);
//
//
//				Configuration cfg = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Company.class);
//	            SessionFactory sf= cfg.buildSessionFactory();
//				Session session =  sf.openSession();
//				Transaction trans =session.beginTransaction();
//
//				List<Employee> empList = new ArrayList<Employee>();
//				empList.add(e1);empList.add(e2);empList.add(e3);
//
//				session.save(c);
//				for(Employee emp : empList) {
//					session.save(emp);
//				}
//				session.save(c);
//				session.save(e1);
//				trans.commit();
//				session.close();
//		 
	


//write a hibernate program  to store list of student information in a database table,id,name,contact,persetile



			Student s1 = new Student();
			s1.setsId(1);
			s1.setsName("Tanisha");
			s1.setsContact(012345);
			s1.setsPercentage(80.7);
			Student s2 = new Student();
			s2.setsId(2);
			s2.setsName("kavya");
			s2.setsContact(234567);
			s2.setsPercentage(77.7);
			
			Configuration cfg = new Configuration().addAnnotatedClass(Student.class);
			cfg.configure();
			SessionFactory sfac = cfg.buildSessionFactory();
			Session s = sfac.openSession();
			Transaction t = s.beginTransaction();
			
			List<Student> stdList = new ArrayList<Student>();
			stdList.add(s1);
			stdList.add(s2);
			for(Student std : stdList) {
				s.save(std);
			}
			t.commit();
			s.close();
	}
}







