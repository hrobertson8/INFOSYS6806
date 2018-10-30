package edu.umsl.inheritance2;

public class Rectangle extends Shape {

	private int length;
	private int breadth;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void computeArea() {

		double area = Math.PI * length * breadth;

		System.out.println("Rectangle Area: " + area);
	}
}
