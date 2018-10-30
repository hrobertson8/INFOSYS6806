package edu.umsl.abstractclasses;

public class App {
	
	public static void main(String[] args) {
		
		Furniture s = new Sofa();
		s.computePrice(2000);
		s.getCompanyName();
		s = new CoffeeTable();
		s.computePrice(500);
		s.getCompanyName();
	}
}
