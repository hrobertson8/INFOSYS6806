package edu.umsl.learningjava;

public class HelloWorld {
	public static void main(String args[]) {
		System.out.println("Hello World");
		
		Person p = new Person();
		Person p1 = new Person();
		
		p.run();
		p1.run();
	}
}
