package HibernateSpringIntegration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate; 
public class EmployeeDao {

	
	HibernateTemplate hibernateTemplate;
	
	public EmployeeDao() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTemplate(HibernateTemplate hibernateTemplate){
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	public void saveEmployee(Employee e){
		hibernateTemplate.save(e);
	}
	public void updateEmployee(Employee e){
		hibernateTemplate.update(e);
	}
	public void deleteEmployee(Employee e){  
		hibernateTemplate.delete(e);  
	}  
	//method to return one employee of given id  
	public Employee getById(int id){  
	    Employee e=(Employee)hibernateTemplate.get(Employee.class,id);  
	    return e;  
	}  
	//method to return all employees  
	public List<Employee> getEmployees(){  
	    List<Employee> list=new ArrayList<Employee>();  
	    list=hibernateTemplate.loadAll(Employee.class);  
	    return list;  
	}  
	

}
