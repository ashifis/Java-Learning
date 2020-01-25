package com.HBVersioning;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class ClientsSave {

	public ClientsSave() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		
		// TODO Auto-generated method stub
		
		Configuration cf  = new  Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cf.buildSessionFactory();
		
		Session session = sessionFactory.openSession();
		Product p = new Product();
		p.setProductId(4);
		p.setProductName("Moto G5");
		p.setProductPrice(2017);
		
		Transaction tx = session.beginTransaction();
		
		session.save(p);
		
		tx.commit();
		
		Object o1 = session.load(Product.class,new Integer(1));
		Product p11 = (Product) o1;
		System.out.println(p11.getProductName());
		System.out.println(p11.getProductVersion());

		
		session.close();
		sessionFactory.close();
		
		

	}

}
