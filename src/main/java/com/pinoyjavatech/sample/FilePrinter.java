package com.pinoyjavatech.sample;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FilePrinter {

	public void printFile(File file) {
		try {
			Files.readAllLines(file.toPath()).forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void printStr(String str) {
		System.out.println(str);
	}
}
