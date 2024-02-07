
package com.jsp.hibernate.JavaPersistenceAPI;

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
		Car car = new Car();
		car.setCarId(1);
		car.setCarName("BMW");
		car.setCarPrice(2000000);

		Car car1 = new Car();
		car.setCarId(2);
		car.setCarName("RUBICON");
		car.setCarPrice(3000000);

		Car car2 = new Car();
		car.setCarId(3);
		car.setCarName("THAR");
		car.setCarPrice(100000);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tanisha");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();


		entityTransaction.begin();
		entityManager.persist(car);
//		entityManager.persist(car1);
//		entityManager.persist(car2);

		Car car3 = entityManager.find(Car.class, 1);
		System.out.println(car3);
		Car car4 = entityManager.find(Car.class, 2);
		System.out.println(car4);
		Car car5 = entityManager.find(Car.class, 3);
		System.out.println(car5);

		entityTransaction.commit();
	}
}
