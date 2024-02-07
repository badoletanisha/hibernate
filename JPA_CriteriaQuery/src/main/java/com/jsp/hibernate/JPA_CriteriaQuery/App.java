package com.jsp.hibernate.JPA_CriteriaQuery;

//import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
//import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;


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
		EntityTransaction et = em.getTransaction();

//		fatch the single data from database
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//		Root<Employee> root = cq.from(Employee.class);
//		cq.select(root);
//		cq.where(cb.equal(root.get("employeeId"), 1));
//		Query q =em.createQuery(cq);
//		System.out.println(q.getSingleResult());

		
//		fatch the multiple data from database
//		--------------------------------------------
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Employee> cq = cb.createQuery(Employee.class);
//		Root<Employee> root = cq.from(Employee.class);
//		cq.select(root);
//		Query q =em.createQuery(cq);
//		List<Employee> emp= q.getResultList();
//		for(Employee e:emp) {
//			System.out.println(e);
//		}

// update the data
//----------------------
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaUpdate<Employee> cu = cb.createCriteriaUpdate(Employee.class);
		Root<Employee> root = cu.from(Employee.class);
		cu.set(root.get("employeeSalary"), 500000);
		cu.where(cb.equal(root.get("employeeId"), 1));
		System.out.println(em.createQuery(cu).executeUpdate()+"row update");
		}

}





	
