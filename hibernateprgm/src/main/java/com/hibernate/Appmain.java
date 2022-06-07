package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Appmain {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session ses = factory.openSession();
		Employee item1 = new Employee();
		item1.setid(1);
		item1.setname("Teja");
		item1.setcity("HYD");
		
		Employee item2 = new Employee();
		item2.setid(2);
		item2.setname("Sanvitha");
		item2.setcity("Nizambad");

		List<Employee> l1 = new ArrayList<Employee>();
		l1.add(item1);
		l1.add(item2);

		Transaction tx = ses.beginTransaction();
		ses.save(item1);
		ses.save(item2);

		tx.commit();
		ses.close();
		factory.close();

	}
}