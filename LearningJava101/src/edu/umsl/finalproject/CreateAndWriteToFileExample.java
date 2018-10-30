package edu.umsl.finalproject;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class CreateAndWriteToFileExample {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("files.txt"); // created a low level stream
			dos = new DataOutputStream(fos); // created a high level stream by feeding in 								  				//the low level stream
			dos.writeInt(10); // writing bytes
			dos.writeDouble(783);
			dos.writeBoolean(true); // requires only one byte
			dos.writeChars("Hello");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
