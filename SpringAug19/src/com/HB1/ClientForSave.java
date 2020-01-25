package com.HB1;



import org.hibernate.*;
import org.hibernate.cfg.*;

import com.HB1.Product;

public class ClientForSave { 

	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Product p=new Product();

		p.setProductId(1027);
		p.setProName("iPhone1198");
		p.setPrice(35666);

		Transaction tx = session.beginTransaction();
		session.save(p);
		System.out.println("Object saved successfully.....!!");
		
		
		Object o = session.load(Product.class,new Integer(1027));
		
		
		Product p1 = (Product) o;
		System.out.println(p1.getProName());

		//session.delete(p1);
		p1.setProName("iPhone1198New");
		tx.commit();
		Object o1 = session.load(Product.class,new Integer(1027));
		
		
		Product p11 = (Product) o1;
		System.out.println(p11.getProName());

		session.close();
		factory.close();
	}

}