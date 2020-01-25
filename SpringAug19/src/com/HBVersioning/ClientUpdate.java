package com.HBVersioning;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public ClientUpdate() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Configuration cf= new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();
		Session session = factory.openSession();
		
		
		System.out.println("sadfads");
		
		
		Object ob = session.load(Product.class, new Integer(1));
		
		Product p = (Product) ob;
		Transaction trx = session.beginTransaction();
		
		p.setProductName("Moto Razr2");
		
		trx.commit();
		
		
		Object ob1 = session.load(Product.class, new Integer(1));
		Product p2 = (Product) ob1;
		
		System.out.println(p2.getProductId());
		System.out.println(p2.getProductName());
		System.out.println(p2.getProductPrice());
		System.out.println(p2.getProductVersion());
		
		session.close();
		factory.close();
		
		
		
		
		
		
		
		
		
		

	}

}
