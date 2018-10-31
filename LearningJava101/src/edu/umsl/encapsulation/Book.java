package edu.umsl.encapsulation;

import java.util.Date;

public class Book {

	private String name;
	private String isbn;
	private Author author;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public class Author {

		private String firstName;
		private String lastName;
		private Date dob;
		private Address address;

		/*
		 * public Author(String f, String l, Date d, Address address) { firstName = f;
		 * lastName = l; dob = d; }
		 * 
		 * public String toString() { return this.firstName + " " + this.lastName + " "
		 * + this.dob + " " + this.address;
		 * 
		 * }
		 */

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getDob() {
			return dob;
		}

		public void setDob(Date dob) {
			this.dob = dob;
		}

		public Address getAddress() {
			return address;
		}

		public void setAddress(Address address) {
			this.address = address;
		}

	}

}
