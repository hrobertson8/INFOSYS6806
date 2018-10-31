package edu.umsl.bookstore;

public class App {

	public static void main(String[] args) {

		Bookstore bookstore = new Bookstore();
		Book book = new Book();
		Author author = new Author();
		Address address = new Address();

		address.setStreetName("Yikes");

		System.out.println(address.getStreetName());

	}

}
