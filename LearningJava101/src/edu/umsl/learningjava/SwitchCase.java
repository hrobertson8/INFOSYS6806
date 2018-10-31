package edu.umsl.learningjava;

public class SwitchCase {

	public static void main(String[] args) {

		int a = 10;
		String value;

		// if value of a is 1, print 1
		switch (a) {

		case 1:
			value = "A is 1";
			break;

		case 2:
			value = "A is 2";
			break;

		case 3:
			value = "A is 3";
			break;

		case 4:
			value = "A is 4";
			break;

		default:
			value = "A is undefined";
			break;

		}

		System.out.println(value);

	}

}
