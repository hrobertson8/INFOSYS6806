package edu.umsl.finalproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class HannahsATM {

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

	public static void deposit() throws Exception {
		BufferedReader reader = null;
		System.out.println("Please enter the amount you will deposit: ");
		reader = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(reader.readLine());
		int currentBalance = readFromFile();
		System.out.println("Previous balance: " + currentBalance);
		int newBalance = s + currentBalance;
		System.out.println("New balance: " + newBalance);
		
		writeToFile(newBalance);
	}

	public static void withdraw() throws Exception {
		BufferedReader reader = null;
		System.out.println("Please enter the amount you will withdraw: ");
		reader = new BufferedReader(new InputStreamReader(System.in));
		int s = Integer.parseInt(reader.readLine());
		int currentBalance = readFromFile();
		System.out.println("Previous balance: " + currentBalance);
		int newBalance = currentBalance - s;
		System.out.println("New balance: " + newBalance);
		
		writeToFile(newBalance);
	}

	public static void currentBalance() throws Exception {
		int currentBalance = readFromFile();
		System.out.println("Current balance: " + currentBalance);	
	}

	static int readFromFile() {
		FileInputStream fis = null;
		DataInputStream dis = null;
		int integer1 = 0;
		try {
			fis = new FileInputStream("myfile.txt");
			dis = new DataInputStream(fis);
			integer1 = dis.readInt();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return integer1;
	}
	
	static void writeToFile(int newBalance) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("myfile.txt");
			dos = new DataOutputStream(fos);					
			dos.writeInt(newBalance); 
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

