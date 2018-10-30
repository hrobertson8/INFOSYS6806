package edu.umsl.polymorphism2;

public class Honda implements Car {

	@Override
	public int getNumberOfTires() {
		return 4;

	}

	@Override
	public int getMaxSpeed() {
		return 175;

	}

	@Override
	public int getNumberOfDoors() {
		return 4;

	}

	@Override
	public int getNumberOfLights() {
		return 4;
	}

}
