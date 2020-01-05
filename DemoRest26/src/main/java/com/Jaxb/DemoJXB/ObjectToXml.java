package com.Jaxb.DemoJXB;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class ObjectToXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectToXml objectToXml = new ObjectToXml();
	//	objectToXml.marshaller();
		objectToXml.unmarshaller();

	}
	
	public void unmarshaller() {
		try {    

	      File file = new File("employee.xml");    
          JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);    
       
          Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();    
          Employee e=(Employee) jaxbUnmarshaller.unmarshal(file);    
          System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());  
            
        } catch (JAXBException e) {e.printStackTrace(); }    
       
}  
	
	
	public void marshaller() {
		
		JAXBContext contextObj = null;
		Marshaller marshaller = null;
		try {
			 contextObj = JAXBContext.newInstance(Employee.class);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			 marshaller = contextObj.createMarshaller();
			 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Employee emp = new Employee(1, "Ashif", 1555);
		try {
			marshaller.marshal(emp, new FileOutputStream("employee.xml"));
			System.out.println("Done");
		} catch (FileNotFoundException | JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}	
