package edu.umsl.abstractclasses;

public class Sofa extends Furniture {

	@Override
	public void computePrice(int price) {
		System.out.println("$" + price);
	}
	@Override
	public void getCompanyName() {
		super.getCompanyName();
	}
}
