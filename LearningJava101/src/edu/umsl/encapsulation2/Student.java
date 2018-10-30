package edu.umsl.encapsulation2;

//only this class knows about these variables
//can only be used inside the brackets
//write getters and setters to use them. methods.
//student object, get me the name of the student. 
//have to set name. 
public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private Address address;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	
}
