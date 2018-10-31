package edu.umsl.encapsulation;

public class Address {

	private String streetName;
	private String houseNumber;
	private String apartmentNumber;
	private String zipcode;

	public Address(String s, String a, String h, String z) {
		streetName = s;
		houseNumber = h;
		apartmentNumber = a;
		zipcode = z;
	}

	public String toString() {
		return this.streetName + " " + this.houseNumber + " " + this.apartmentNumber + " " + this.zipcode;

	}

	public String getApartmentNumber() {
		return apartmentNumber;
	}

	public void setApartmentNumber(String apartmentNumber) {
		this.apartmentNumber = apartmentNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}