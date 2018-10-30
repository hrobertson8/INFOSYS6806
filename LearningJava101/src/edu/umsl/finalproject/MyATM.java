package edu.umsl.finalproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyATM {

	public static void main(String[] args) throws Exception {
			BufferedReader reader = null;
			System.out.println("Hello! Please type the number associated with the action you'd like to perform.");
			System.out.println("1: View Current Balance");
			System.out.println("2: Withdraw");
			System.out.println("3: Deposit");
			
			reader = new BufferedReader(new InputStreamReader(System.in));
			int s = Integer.parseInt(reader.readLine());
			switch (s) {
			case 1:
				getBalance();
				break;
				
			case 2:
				withdraw();
				break; 
			
			case 3:
				deposit();
				break; 
					
			}
			
		}

	private static void deposit() {
		// TODO Auto-generated method stub
		
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		
	}

	private static void getBalance() {
		// TODO Auto-generated method stub
		
	}

	}


