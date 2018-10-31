package edu.umsl.polymorphism;

public class App {

	public static void main(String[] args) {

		Table t = new CoffeeTable();
		System.out.println("Coffee table legs: " + t.getNumberOfLegs());

		t = new Table();
		System.out.println("Table Legs: " + t.getNumberOfLegs());
	}

}
