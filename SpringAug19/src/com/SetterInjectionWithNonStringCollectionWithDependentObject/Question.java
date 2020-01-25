package com.SetterInjectionWithNonStringCollectionWithDependentObject;

import java.util.Iterator;
import java.util.List;

public class Question {

	private int id;
	private String name;
	private List<Answers> answers;
	
	public List<Answers> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	
	@Override
	public String toString() {
		return "Question [answers=" + answers + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	public void display(){
			
		System.out.println("Name : "  + name);
		System.out.println("ID: " + id);
		
		System.out.println("Answers : ");
		Iterator<Answers> itr = answers.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
