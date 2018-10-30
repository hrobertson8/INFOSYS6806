package edu.umsl.interfaces;

public class Rectangle implements Shape {

	@Override
	public void computeArea() {
		int length = 5;
		int width = 8;
		double area = length * width;
	
		System.out.println("Rectangle Area: " + area);
	}
}
