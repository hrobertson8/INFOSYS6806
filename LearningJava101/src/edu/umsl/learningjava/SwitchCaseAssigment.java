package edu.umsl.learningjava;

public class SwitchCaseAssigment {

	public static void main(String[] args) {

		int numberDialed = 0;
		String value;

		switch (numberDialed) {

		case 1:
			value = "Number Dialed is 1, N/A";
			break;

		case 2:
			value = "Number Dialed is 2, ABC";
			break;

		case 3:
			value = "Number Dialed is 3, DEF";
			break;

		case 4:
			value = "Number Dialed is 4, GHI";
			break;

		case 5:
			value = "Number Dialed is 5, JKL";
			break;

		case 6:
			value = "Number Dialed is 6, MNO";
			break;
			
		case 7:
			value = "Number Dialed is 7, PQRS";
			break;
			
		case 8:
			value = "Number Dialed is 8, TUV";
			break;
			
		case 9:
			value = "Number Dialed is 9, WXYZ";
			break;
			
		case 0:
			value = "Number Dialed is 0, +";
			break;

		default:
			value = "This value is undefined";
			break;

		}

		System.out.println(value);

	}

}
