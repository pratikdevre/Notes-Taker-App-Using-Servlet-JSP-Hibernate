package com.notes.hbm;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnect {
	
	private static SessionFactory factory =null;
	public static SessionFactory getFactory() {
		if(factory == null) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return factory;
	}
	
	public static void closeFactory() {
		factory.close();
	}
}
