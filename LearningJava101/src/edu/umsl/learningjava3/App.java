package edu.umsl.learningjava3;

public class App {
	
	public static void main(String[] args) {
		
		Book book = new Book(5, "BookName", "AuthorName");
		
		System.out.println(book.getAuthorName());
	}
	

}
