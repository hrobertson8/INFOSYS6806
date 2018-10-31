package edu.umsl.inheritance2;

import edu.umsl.inheritance2.Shape;

public class Circle extends Shape {

	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void computeArea() {

		double area = Math.PI * radius * radius;

		System.out.println("Circle Area: " + area);
	}

}
