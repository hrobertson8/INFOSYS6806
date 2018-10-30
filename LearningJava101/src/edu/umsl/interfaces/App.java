package edu.umsl.interfaces;

public class App {
	
	public static void main(String[] args) {
		
		Shape shape = new Circle();
		shape.computeArea();
		
		shape = new Rectangle();
		shape.computeArea();
		
		shape = new Square();
		shape.computeArea();
	}
}
