package edu.umsl.encapsulation2;

public class App {

	
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setFirstName("Hannah");
		student.setLastName("Robertson");
		student.setId(12345);
		
		System.out.println(student.getFirstName());
		System.out.println(student.getLastName());
		System.out.println(student.getId());
		

	}

}
