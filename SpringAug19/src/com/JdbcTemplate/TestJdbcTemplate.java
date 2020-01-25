package com.JdbcTemplate;
 

import org.springframework.context.ApplicationContext;  
import org.springframework.context.support.ClassPathXmlApplicationContext;  
public class TestJdbcTemplate {  
  
public static void main(String[] args) {  
    ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
    
    System.out.println("as");
    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
    
    System.out.println("dd");
    int status=dao.saveEmployee(new Employee(105,"Amar",3500)); 
    
    System.out.println(status);  
   
    int updateStatus = dao.updateEmployee(new Employee(105,"Amara",50000));
    System.out.println(updateStatus);
    
        
    /*int status=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
    System.out.println(status); 
    */  
          
    /*Employee e=new Employee(); 
    e.setId(102); 
    int status=dao.deleteEmployee(e); 
    System.out.println(status);*/  
      
}  
  
}  
