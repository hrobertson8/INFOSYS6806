package edu.umsl.abstractclasses;

public abstract class Furniture {

	public void getCompanyName() {

		String company = "Ashley Furniture";
		System.out.println(company);
	}

	public abstract void computePrice(int price);
}
