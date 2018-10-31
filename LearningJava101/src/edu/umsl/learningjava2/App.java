package edu.umsl.learningjava2;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {

	public static void main(String[] args) {

		// class is a blueprint to create an object
		// instance of student w/ new student
		// create the Address class, then create a new address object
		Student student = new Student();
		Calendar calendar = new GregorianCalendar(1994, 4, 2);
		Date date = new Date(calendar.getTimeInMillis());
		Address address = new Address();

		student.setFirstName("Alana");
		student.setLastName("Simpson");
		student.setDob(date);
		address.setHouseNumber("8723");
		address.setStreetName("Delmar");
		address.setZipcode("63118");

		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getDob());
		System.out.println(address.getHouseNumber());
		System.out.println(address.getStreetName());
		System.out.println(address.getZipcode());

	}

}
