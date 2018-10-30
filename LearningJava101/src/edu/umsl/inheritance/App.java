package edu.umsl.inheritance;

public class App {

	public static void main(String[] args) {

		Honda h = new Honda();
		h.setColor("Charcoal");
		h.setMaxSpeed(140);

		Toyota t = new Toyota();
		t.setColor("Red");
		t.setMaxSpeed(130);

		Audi a = new Audi();
		a.setColor("Black");
		a.setMaxSpeed(120);

		System.out.println("Honda");
		System.out.println("Color " + h.getColor());
		System.out.println("Speed " + h.getMaxSpeed());
		System.out.println();
		System.out.println("Toyota");
		System.out.println("Color " + t.getColor());
		System.out.println("Speed " + t.getMaxSpeed());
		System.out.println();
		System.out.println("Audi");
		System.out.println("Color " + a.getColor());
		System.out.println("Speed " + a.getMaxSpeed());
	}

}
