package edu.umsl.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class WhatFilesAreInMyDirectory {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter path: ");
		String directory = null;

		try {
			directory = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		File f = new File(directory);
		if (f.exists()) {
			String array[] = f.list();

			int n = array.length;

			for (int i = 0; i < n; i++) {
				System.out.println(array[i]);
			}
		} else
			System.out.println("Directory not found");
	}
}