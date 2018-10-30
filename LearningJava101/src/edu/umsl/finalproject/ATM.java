package edu.umsl.finalproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATM {
	
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
			currentBalance();
			break;
			
		case 2:
			withdraw();
			break; 
		
		case 3:
			deposit();
			break; 
				
		}
		
	}
	
	public static void currentBalance() throws Exception {
		BufferedReader reader = null;
		int s = Integer.parseInt(reader.readLine());
		int currentBalance = fileReader();
		System.out.println("Your current balance is: " + currentBalance);
		reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Current balance: " + currentBalance);
	}

	public static void withdraw() throws Exception {
		BufferedReader reader = null;
		System.out.println("Please enter the amount you will withdraw");
		reader = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(reader.readLine());
		int currentBalance = fileReader();
		System.out.println("Previous balance: " + currentBalance);
		int newBalance = s - currentBalance;
		System.out.println("New balance: " + newBalance);
		
		fileWriter(newBalance);
	}

	public static void deposit() throws Exception {
		BufferedReader reader = null;
		System.out.println("Please enter the amount you will deposit");
		reader = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(reader.readLine());
		int currentBalance = fileReader();
		System.out.println("Previous balance: " + currentBalance);
		int newBalance = s + currentBalance;
		System.out.println("New balance: " + newBalance);
		
		fileWriter(newBalance);
	}

	private static int fileReader() {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void fileWriter(int newBalance) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		File file = new File("myfile.txt");

		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos); 	

			dos.writeInt(5678); 

			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
