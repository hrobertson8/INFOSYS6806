package edu.umsl.learningjava3;

public class Book {

	int numberOfChapters;
	String name;
	String authorName;
	// every class has a default constructor
	// command +
	// constructor = same name as your book.
	// contruct a class by using new keywork

	public Book(int numberOfChapters, String name, String authorName) {

		this.numberOfChapters = numberOfChapters;
		this.name = name;
		this.authorName = authorName;
	}

	public int getNumberOfPages() {
		return numberOfChapters;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfChapters = numberOfChapters;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
