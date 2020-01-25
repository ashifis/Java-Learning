package com.spring.JavaBrains;

public class Rectangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	
	public Point getPointA() {
		return pointA;
	}



	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}



	public Point getPointB() {
		return pointB;
	}



	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}



	public Point getPointC() {
		return pointC;
	}



	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}



	public Rectangle() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void draw(){
		
		System.out.println("Drawing Rectangle");
		System.out.println("pointA X : " + getPointA().getX()  + "\n" +
				"       Y : " + getPointA().getY());
		System.out.println("pointB X : " + getPointB().getX()  + "\n" +
				"       Y : " + getPointB().getY());
		System.out.println("pointc X : " + getPointC().getX()  + "\n" +
				"       Y : " + getPointC().getY());
	}



	@Override
	public String toString() {
		return "Rectangle [pointA=" + pointA + ", pointB=" + pointB
				+ ", pointC=" + pointC + "]";
	}
	
	

}
