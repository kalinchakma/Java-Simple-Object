package com.core.a;

public class Triangle extends Figure {

	public Triangle(double x,double y) {
		super(x,y);
	}

	@Override
	public void Area() {
		double a = (getDimension1()*getDimension2())/2;
		System.out.println("Area of triangle is "+a);
	}
	public static void main(String args[]) {
		new Triangle(3,3).Area();
	}

}
