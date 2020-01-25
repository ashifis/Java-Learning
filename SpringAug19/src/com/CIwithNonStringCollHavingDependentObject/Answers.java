package com.CIwithNonStringCollHavingDependentObject;


//com.CIwithNonStringCollHavingDependentOnject.Answers
public class Answers {
	
	private int id;
	private String name ;
	private String by;
	
	public Answers(){}
	
	public Answers(int id , String name,String by){
		super();
		this.id =  id;
		this.name = name;
		this.by = by;
			}
	public String toString(){
		System.out.println("hmmm....");
		return id +  " by " + by + " name " + name;
	}
	

}
