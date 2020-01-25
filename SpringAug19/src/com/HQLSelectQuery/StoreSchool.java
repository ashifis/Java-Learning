package com.HQLSelectQuery;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreSchool {
	private static Configuration cfg =null;
	private static SessionFactory sf = null;
	private static Session session = null;
	private static Transaction trx ;
	private static School[] sch;

	public static void SetSchool() {
		// TODO Auto-generated constructor stub
		cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		sf = cfg.buildSessionFactory();
		session = sf.openSession();
		
		
	}
	public static void closeSession(){
		session.close();
		sf.close();
		
	}
	public static void trxBegin(){
		trx = session.beginTransaction();
	}
	
	public static void trxCommit(){

		trx.commit();
	}
	
	
	
	
	public static  void insertintoSchool(){
		sch = new School[5];
		
		System.out.println(sch[0]);
		
		sch[0] = new School();
		
		sch[0].setRoll(1);
		System.out.println(sch[0]);
		sch[0].setClassStd("II");
		sch[0].setName("Rohan");
		sch[0].setAddress("Prafullanagar");
		sch[1] = new School();
		sch[1].setRoll(2);
		sch[1].setClassStd("II");
		sch[1].setName("Kaustuv");
		sch[1].setAddress("Dotalabari");
		sch[2] = new School();
		sch[2].setRoll(3);
		sch[2].setClassStd("II");
		sch[2].setName("Anmay");
		sch[2].setAddress("Girls School");
		sch[3] = new School();
		sch[3].setRoll(4);
		sch[3].setClassStd("II");
		sch[3].setName("Sudarshan");
		sch[3].setAddress("Subhashpalli");
		sch[4] = new School();
		sch[4].setRoll(5);
		sch[4].setClassStd("II");
		sch[4].setName("Ron");
		sch[4].setAddress("Wipro");
		
		for( int i=0;i<sch.length;i++){
			session.save(sch[i]);
		}

		
	}
	
	public static void showSchool(){
		for(int i =0  ; i<sch.length;i++){
			Object o = session.load(School.class,new Integer(i+1));
			School scl = (School) o;
			System.out.println("Roll: "+ scl.getRoll());
			System.out.println("Name: "+ scl.getName());
			System.out.println("Class: "+ scl.getClassStd());
			System.out.println("Address: "+ scl.getAddress());
		}
	
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		SetSchool();
		insertintoSchool();
		trxBegin();
		trxCommit();
		
		showSchool();
		
		Query qry = session.createQuery("select p.roll,p.name,p.Address" +
				" from School p");

		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();

		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();

			System.out.println("Roll id : "+o[0]+ " Name : "+o[1] + "Address : " + o[2]);

			System.out.println("---------------------------------------------------");
		}			
		
		closeSession();
	}

}
