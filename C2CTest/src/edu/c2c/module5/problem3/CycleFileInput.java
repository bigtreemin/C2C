package edu.c2c.module5.problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CycleFileInput {


	public static void main(String[] args) {
		
		Scanner input = null;
		try{
			File file = new File("Cycle.txt");
			
			input = new Scanner(file);
			
		} catch (FileNotFoundException e) {
			System.out.println("Check the file name.");
		}
		
		String text = input.nextLine();
		System.out.println(text);
		
	    input.close();
	}

}
