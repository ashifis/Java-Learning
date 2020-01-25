package com.ConstructorInjectionWithMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {

	/**
	 * @param args 
	 */
	private int id;
	private String name;
	private Map<String,String> answers;
	
	public Questions() {
		 // TODO Auto-generated constructor stub
	}
	public  Questions(int id,String name ,Map<String, String> answers){
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	public void displayInfo(){
		
		System.out.println("Question id: "+ id);
		System.out.println("Question name : " + name);
		
		
		System.out.println("Answers :");
		
		Set<Entry<String, String>> set=answers.entrySet();
		
		Iterator<Entry<String, String>> it = set.iterator();
		while(it.hasNext()){
			Entry<String,String> entry=it.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());  
		}
		
		
	}

}
