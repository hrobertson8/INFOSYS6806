package edu.umsl.learningjava3;

public class FictionBooks extends Book {

	int numberOfChapters;
	String name;
	String authorName;
	int aisleNumber;

	public FictionBooks(int numberOfChapters, String name, String authorName, int aisle) {

		super(numberOfChapters, name, authorName);
		this.aisleNumber = aisle;
	}

}
