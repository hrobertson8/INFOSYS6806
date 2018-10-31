package edu.umsl.polymorphism2;

public class App {

	public static void main(String[] args) {

		Car c = new CivicSport();

		System.out.println("CivicSport Info");
		System.out.println("Speed: " + c.getMaxSpeed());
		System.out.println("Doors: " + c.getNumberOfDoors());
		System.out.println("Lights: " + c.getNumberOfLights());
		System.out.println("Tires: " + c.getNumberOfTires());
		System.out.println("GPS: " + ((CivicSport) c).hasGPS());
	}

}
