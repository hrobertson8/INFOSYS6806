package edu.umsl.interfaces;

public class Square implements Shape {

	@Override
	public void computeArea() {
		int side = 5;
		double area = side * side;

		System.out.println("Square Area: " + area);
	}
}
