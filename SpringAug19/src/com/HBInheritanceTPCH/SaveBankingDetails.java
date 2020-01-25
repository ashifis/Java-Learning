package com.HBInheritanceTPCH;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveBankingDetails {

	public SaveBankingDetails() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg  = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		
		CreditCard cc = new CreditCard();
		
		cc.setAmount(0.00);
		cc.setCreditCardType("Visa");
		cc.setPaymentID(114555999);
		
		Transaction trx = session.beginTransaction();
		session.save(cc);
		
		
		Cheque cq = new Cheque();
		cq.setAmount(230.23);
		cq.setChequeType("ICICI");
		cq.setPaymentID(446999888);
		
		session.save(cq);
		
		
		trx.commit();
		
		session.close();
		
		sf.close();
		
		
		

	}

}
