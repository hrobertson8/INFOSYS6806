package edu.umsl.learningjava;

public class Fibonacci {
	
	//My Fibonacci project
	
	public static void main(String args[]) {
	
		//Declare seed numbers and when to stop the loop
		int seed0 = 0; //seed number
		int seed1 = 1; //seed number
		int c = seed0 + seed1;
		
		
		//print the seed numbers outside of the for loop
		System.out.println(seed0);
		System.out.println(seed1);
		
		
		for (int i = 1; i <= 13; i++)
		{
			
			//int sum =  seed0 + seed1; //sum = 0 + 1 = 1, 
			
			seed0 = seed1; //0 = 1
			c = seed0 + seed1;
			seed0 = seed1;
			seed1 = c;
			//seed1 = i;

			
			System.out.println(i);
		}
	}
}