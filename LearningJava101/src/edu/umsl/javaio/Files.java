package edu.umsl.javaio;

import java.io.File;

public class Files {

	public static void main(String[] args) {
		File directory = new File("/Users/HannahRobertson/Desktop");
		File[] files = directory.listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}

	}

}
