package edu.umsl.polymorphism2;

public class CivicSport extends Honda implements Car {

	@Override
	public int getMaxSpeed() {
		return super.getMaxSpeed();
	}

	@Override
	public int getNumberOfLights() {
		return super.getNumberOfLights();
	}

	@Override
	public int getNumberOfTires() {
		return super.getNumberOfTires();
	}

	@Override
	public int getNumberOfDoors() {
		return 2;
	}

	public boolean hasGPS() {
		return true;
	}

}
