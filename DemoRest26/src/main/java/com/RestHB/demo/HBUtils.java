package com.RestHB.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



import com.RestFul26.DemoRest26.Alien;

public class HBUtils {
	
	private static Configuration cfg =null;
	private static SessionFactory sf = null;
	private static Session session = null;
	private static Transaction trx ;
	
	private static ServiceRegistry registry  = null;
	
	
	public static ServiceRegistry getRegistry() {
		return registry;
	}
	
	public static void setRegistry(ServiceRegistry registry) {
		HBUtils.registry = registry;
	}
	
	
	
	public static Configuration getCfg() {
		return cfg;
	}
	public static void setCfg(Configuration cfg) {
		HBUtils.cfg = cfg;
	}
	public static SessionFactory getSf() {
		return sf;
	}
	public static void setSf(SessionFactory sf) {
		HBUtils.sf = sf;
	}
	public static Session getSession() {
		return session;
	}
	public static void setSession(Session session) {
		HBUtils.session = session;
	}
	public static Transaction getTrx() {
		return trx;
	}
	public static void setTrx(Transaction trx) {
		HBUtils.trx = trx;
	}
	
	
	public HBUtils(String hibernate_cfg_xml,Class annotatedClass){
		//cfg =new Configuration().configure("com/HQLSelectQuery/hibernate.cfg.xml");
		cfg =new Configuration().configure(hibernate_cfg_xml).addAnnotatedClass(annotatedClass.getClass());
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		
	}
	
	public HBUtils(Class annotatedClass){
		//cfg =new Configuration().configure("com/HQLSelectQuery/hibernate.cfg.xml");
		String hibernate_cfg_xml = "com/RestHB/demo/hibernate.cfg.xml";
		cfg =new Configuration().configure(hibernate_cfg_xml).addAnnotatedClass(annotatedClass.getClass());
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		
	}
	
	
	public  void closeSession(){
		session.close();
		sf.close();
		
	}
	public  void trxBegin(){
		trx = session.beginTransaction();
	}
	
	public  void trxCommit(){
		trx.commit();
	}


	public void saveSession(Object object) {session.save(object);
		
	}

}
