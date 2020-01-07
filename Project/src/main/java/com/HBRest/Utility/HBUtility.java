package com.HBRest.Utility;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleObjectStateException;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.HBRest.Entity.Register;




public class HBUtility {
	
	private Configuration cfg ;
	private ServiceRegistry srg ;
	private SessionFactory sf;
	private Session session;
	private Transaction trx ;
	@SuppressWarnings("rawtypes")
	private static java.util.List<Class> annotatedClass;
	
	
	
	public HBUtility() {
		
		cfg = new Configuration().configure().addAnnotatedClass(Register.class);
		/*.addAnnotatedClass(AccountEntity.class).addAnnotatedClass(EmployeeEntity.class);
		.addAnnotatedClass(Gov.class).addAnnotatedClass(State.class);
		.addAnnotatedClass(Manager.class).addAnnotatedClass(TeamLead.class);
		.addAnnotatedClass(AlienHB.class)
		.addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class)*/
	    srg = new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
	    sf = cfg.buildSessionFactory(srg);
	    
	    
	    /*<property name="hibernate.cache.use_second_level_cache">true</property>
   		<property name="hibernate.cache.use_query_cache">true</property>
   		<property name="hibernate.cache.region.factory_class">org.hibernate.cache.ehcache.EhCacheRegionFactory</property>*/
		
	}

	public Session openSession() {
		session = sf.openSession();
		return session;	
	}
	
	public  Transaction beginTrx() {
		trx = (Transaction) session.beginTransaction();
		return trx;
	}
	
	
	public static java.util.List<Class> getAnnotatedClass() {
		return annotatedClass;
	}

	public static void setAnnotatedClass(java.util.List<Class> annotatedClass) {
		HBUtility.annotatedClass = annotatedClass;
	}

	public Configuration getCfg() {
		return cfg;
	}

	public void setCfg(Configuration cfg) {
		this.cfg = cfg;
	}

	public ServiceRegistry getSrg() {
		return srg;
	}

	public void setSrg(ServiceRegistry srg) {
		this.srg = srg;
	}

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public Transaction getTrx() {
		return trx;
	}

	public void setTrx(Transaction trx) {
		this.trx = trx;
	}
	
}
