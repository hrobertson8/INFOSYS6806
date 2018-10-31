package edu.umsl.learningjava;

public class Car {
	String Brand;
	String Color;
	String BodyStyle;
	int MPG;
	int Year;

	public void Speed() {
		String MPH = ("Speed: " + 70 + " MPH");
		System.out.println(MPH);
	}

	public static void main(String args[]) {
		Car Honda = new Car();

		Honda.Speed();
	}
}
