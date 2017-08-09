package com.neusoft.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Test {
	public static void main(String[] args){
		
		Configuration cfg = new Configuration();

		cfg.configure();

		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().
				applySettings(cfg.getProperties()).buildServiceRegistry();
		SessionFactory sf = cfg.buildSessionFactory(serviceRegistry);

		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();
		
		tx.commit();
		
		
	}
}
