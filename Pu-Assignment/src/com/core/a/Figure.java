package com.core.a;

public abstract class Figure {
	double dimension1,dimension2;
	Figure(double x,double y){
		this.dimension1 = x;
		this.dimension2 = y;
	}
	public double getDimension1() {
		return dimension1;
	}
	public void setDimension1(double dimension1) {
		this.dimension1 = dimension1;
	}
	public double getDimension2() {
		return dimension2;
	}
	public void setDimension2(double dimension2) {
		this.dimension2 = dimension2;
	}
	public abstract void Area();
	
	
	
}
