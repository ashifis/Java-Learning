package com.HBRest.Repository;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.HBRest.Entity.Register;
import com.HBRest.Utility.CommonUtils;
import com.HBRest.Utility.HBUtility;




public class HBRestRepository {
	
	
	private HBUtility hbUtils = null;
	private CommonUtils commonUtils = null;
	
	public HBRestRepository() {
		
		System.out.println("Inside HBRestRepository");
		
		hbUtils = new HBUtility();
		
		commonUtils = new CommonUtils();
		
	}

	public String RegisterUser(Register register) {
		commonUtils.enter("RegisterUser");
		Session session = hbUtils.openSession(); 
		Transaction transaction = hbUtils.beginTrx();
		System.out.println(isAlreadyRegistered(register.getUsername()));
		System.out.println(register.getUsername().length());
		if(!isAlreadyRegistered(register.getUsername())) {
			if(register.getUsername() == null || register.getUsername().length()==0 )   {
				System.out.println("Provide valid user id");
				commonUtils.exit("RegisterUser");
				return "Provide valid user id";
			}
			else {session.save(register);
			transaction.commit();
			session.close();
			commonUtils.exit("RegisterUser");
			return register.getUsername() + " create Successfully";}
			}else {System.out.println("User already exists");
			commonUtils.exit("RegisterUser");
			return "User already exists";}
		
		
	}
	public Boolean isAlreadyRegistered(String UserName) {
		commonUtils.enter("isAlreadyRegistered");
		if(UserName != null  && UserName.length()>0) {
			System.out.println( UserName.length());
			Session session = hbUtils.openSession(); 
			Register register = session.get(Register.class,UserName);
			if (register!=null) {
				if(register.getUsername()!=null) {
					commonUtils.enter("isAlreadyRegistered");	
					return true;}
				else {
					commonUtils.enter("isAlreadyRegistered");	
					return false;}
			}
		
		}else {	commonUtils.enter("isAlreadyRegistered");	
			return false;}
		return false;
	}
	
	
}
