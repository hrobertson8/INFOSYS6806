package edu.umsl.learningjava2;

import java.util.Date;

public class Student {
	//private variables - only known within the class
	//use them by wrinting getters and setters (methods)
	private String firstName;
	private String lastName;
	private Long id;
	private Date dob;
	private boolean status;
	private Address address;
	
	//right click, source, generate getters and setters
	
	public String getFirstName() {
		return firstName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	

	
}
