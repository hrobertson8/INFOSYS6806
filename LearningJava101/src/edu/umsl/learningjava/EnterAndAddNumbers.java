package edu.umsl.learningjava;

import java.util.Scanner;

public class EnterAndAddNumbers {
	
		
		public static void main(String args[]) {
			
			int x, y, z;
			
			System.out.println("Enter 2 integers");
			
			/* Create a new object of the scanner class. */
			Scanner input = new Scanner(System.in);
			
			x = input.nextInt();
			y = input.nextInt();
			
			z = x + y;
			
			System.out.println("Sum: " + z);
			
		}
		
}

