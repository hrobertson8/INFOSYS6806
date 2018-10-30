package edu.umsl.interfaces;

public class Circle implements Shape {

	@Override
	public void computeArea() {
		
		double radius = 7;
		double area = PI * radius * radius;
	
		System.out.println("Circle Area: " + area);
	}
}
