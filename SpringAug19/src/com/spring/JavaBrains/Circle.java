package com.spring.JavaBrains;

public class Circle  implements Shape{

	
	private Point pointC;
	
	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub

		System.out.println("Drawing Circle");
		System.out.println("pointC X : " + getPointC().getX()  + "\n" +
				"       Y : " + getPointC().getY());
		
	}

	@Override
	public String toString() {
		return "Circle [pointC=" + pointC + "]";
	}
	
	

}
