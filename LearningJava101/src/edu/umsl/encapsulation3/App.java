package edu.umsl.encapsulation3;

public class App {
	
	public static void main(String[] args) {
		
		BikeStore bikestore = new BikeStore();
		Address bikeStoreAddress = new Address("Menard", "Springfield", "Illiois", "62664");
		
		bikestore.setName("Springfield Bookstore");
		bikestore.setAddress(bikeStoreAddress);
		
		System.out.println("Bookstore: " + bikestore.getName());
		System.out.println("Address: " + bikestore.getAddress());
		
	}
	
	
	

}
