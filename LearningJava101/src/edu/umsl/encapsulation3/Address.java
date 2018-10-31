package edu.umsl.encapsulation3;

public class Address {

	private String streetName;
	private String city;
	private String state;
	private String zipcode;

	public Address(String sn, String c, String s, String z) {

		streetName = sn;
		city = c;
		state = s;
		zipcode = z;

	}

	public String toString() {

		return this.streetName + " " + this.city + " " + this.state + ", " + this.zipcode;

	}

	public String getstreetName() {
		return streetName;
	}

	public void setstreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

}
