package com.HBCompositePrimaryKeys;
import org.hibernate.*;
import org.hibernate.cfg.*;

public class ForOurLogic { 

	public static void main(String[] args)
	{

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Product p=new Product();

				p.setProductId(102);
                p.setProductNane("iPhone11");
                p.setPrice(25000.01); 

	       Transaction tx=session.beginTransaction();
	          session.save(p);
	          System.out.println("Object Loaded successfully.....!!");
	       tx.commit();     

		session.close();
		factory.close();
	}

}