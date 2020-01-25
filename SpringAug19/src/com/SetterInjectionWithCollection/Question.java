package com.SetterInjectionWithCollection;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<String> answers;
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAnswers(List<String> answers){
		this.answers = answers;
	}
	
	public List<String> setAnswers(){
		return answers;
	}
	
	public void display(){
		
		
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		
		System.out.println("Answers are : ");
		Iterator<String> iterator = answers.iterator();
		
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
	
	
	
}
