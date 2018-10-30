package edu.umsl.inheritance2;

public class App {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.setBorder("Blue");
		c.setRadius(10);

		Square s = new Square();
		s.setBorder("Red");
		s.setSide(5);

		Rectangle r = new Rectangle();
		r.setBorder("Orange");
		r.setBreadth(10);
		r.setLength(15);

		System.out.println("Circle Border: " + c.getBorder());
		c.computeArea();

		System.out.println("Square Border: " + s.getBorder());
		s.computeArea();

		System.out.println("Rectangle Border: " + r.getBorder());
		r.computeArea();
	}

}
