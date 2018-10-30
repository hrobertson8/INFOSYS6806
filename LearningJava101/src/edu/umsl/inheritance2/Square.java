package edu.umsl.inheritance2;

public class Square extends Shape {

	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void computeArea() {

		double area = Math.PI * side * side;

		System.out.println("Square Area: " + area);
	}

}
