package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// Author Murat

public class Main {

	public static void main(String[] args) {
	
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			City city =new City();
			city.setName("Dörtdivan");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(1000);
			session.save(city);
			
			
			
//			List<City> cities = session.createQuery("from City c where c.name LIKE '%kar%'").getResultList();
//			
//			for(City city:cities) {
//				System.out.println(city.getName());
//			}
			
			session.getTransaction().commit();
			System.out.println("þehir eklendi");
		}
		finally {
			factory.close();
		}

	}

}
