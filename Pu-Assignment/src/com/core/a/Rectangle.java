package com.core.a;

public class Rectangle extends Figure {

	public Rectangle(double x,double y) {
		super(x,y);
	}

	@Override
	public void Area() {
		double a = getDimension1()*getDimension2();
		System.out.print("Area of Rectangle is "+a);
	}
	public static void main(String args[]) {
		new Rectangle(3,3).Area();
	}
}
