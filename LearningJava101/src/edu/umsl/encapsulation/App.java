package edu.umsl.encapsulation;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {
		
		
		//Bookstore class
		Bookstore bookstore = new Bookstore();
		
		//Book & Author Class
		Book book = new Book();
        Book.Author bookAuthor = book.new Author();
		//("Pierce", "Brown", "1976, 4, 2", authorAddress);
        
		//Address Class
		Address bookstoreAddress = new Address("1234", "Menard", "N/A", "63108");
		Address authorAddress = new Address("1234", "STL", "2E", "64583");
		
		//Date fields
		Calendar calendar = new GregorianCalendar(1976, 4, 2);
		Date date = new Date(calendar.getTimeInMillis());
		
		//set bookstore attributes: id, name, address
		bookstore.setName("STL Bookstore");
		bookstore.setId(123456789L);
		bookstore.setAddress(bookstoreAddress);
		
		//set book attributes: has a name, ISBN, and author 
		book.setName("The Red Rising");
		book.setIsbn("1234567");
		bookAuthor.setFirstName("Pierce");
		bookAuthor.setLastName("Brown");
		bookAuthor.setAddress(authorAddress);
		bookAuthor.setDob(date);
		
		//get bookstore attributes id, name, address, book
		System.out.println("Bookstore");
		System.out.println("Bookstore Name: " + bookstore.getName());
		System.out.println("Bookstore ID: " + bookstore.getId());
		System.out.println("Bookstore Address: " + bookstoreAddress.getHouseNumber() + " " + bookstoreAddress.getStreetName() + ", " + bookstoreAddress.getZipcode());
		System.out.println();
		
		//get book and author attributes //set book attributes: has a name, ISBN, and set author attributes: first, last, dob, address
		System.out.println("Book");
		System.out.println("Name: " + book.getName());
		System.out.println("ISBN: " + book.getIsbn());
		System.out.println("Author: " + bookAuthor.getFirstName() + " " + bookAuthor.getLastName());
		System.out.println("Author DOB: " + bookAuthor.getDob());
		System.out.println("Author Address: " + authorAddress.getHouseNumber() + " " + authorAddress.getStreetName() + ", " + authorAddress.getZipcode() );


	}
}

