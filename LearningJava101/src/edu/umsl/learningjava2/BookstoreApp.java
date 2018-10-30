package edu.umsl.learningjava2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class BookstoreApp {

	public static void main(String[] args) {
		
		
		//Bookstore class
		Bookstore bookstore = new Bookstore();
		
		//Book & Author Class
		Book book = new Book();
		Book.Author bookAuthor = book.new Author();
        
		//Address Class
		Address bookstoreAddress = new Address();
		Address authorAddress = new Address();
		
		//Date fields
		Calendar calendar = new GregorianCalendar(1976, 4, 2);
		Date date = new Date(calendar.getTimeInMillis());
		
		//set bookstore attributes: id, name, address
		bookstore.setName("STL Bookstore");
		bookstore.setId(123456789L);
		bookstoreAddress.setHouseNumber("1234");
		bookstoreAddress.setStreetName("Menard");
		bookstoreAddress.setZipcode("64544");;
		
		//set book attributes: has a name, ISBN, and author 
		book.setName("The Red Rising");
		book.setIsbn("1234567");
		bookAuthor.setFirstName("Pierce");
		bookAuthor.setLastName("Brown");
		authorAddress.setHouseNumber("1234");
		authorAddress.setStreetName("Pine");
		authorAddress.setZipcode("64544");
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
