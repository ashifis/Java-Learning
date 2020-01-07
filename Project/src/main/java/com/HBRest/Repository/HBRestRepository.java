package com.HBRest.Repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HBRest.Entity.Register;
import com.HBRest.Utility.HBUtility;




public class HBRestRepository {
	
	
	private HBUtility hbUtils = null;
	
	public HBRestRepository() {
		
		System.out.println("Inside HBRestRepository");
		
		hbUtils = new HBUtility();
		
	}

	public void RegisterUser(Register register) {
		
		Session session = hbUtils.openSession(); 
		Transaction transaction = hbUtils.beginTrx();
		
		session.save(register);
		transaction.commit();
		session.close();
		
	}
	
	
}
