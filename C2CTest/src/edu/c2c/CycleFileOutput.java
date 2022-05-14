package edu.c2c;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CycleFileOutput {

	public static void main(String[] args) {

		String filename = "Cycle.txt";
		File file = new File(filename);
		PrintWriter output = null;
		Scanner input = null;

		// handle the file system
		try {
			output = new PrintWriter(filename);

		} catch (FileNotFoundException e) {
			System.out.println("Problem creating the file, check permission");
		}
		try {
			input = new Scanner(file);

		} catch (FileNotFoundException e) {
			System.out.println("Check the file name.");
		}

		// main program
		// read whole document
		while (input.hasNext()) {

			System.out.print(input.nextLine());
		}

		// instance scanner
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter text for cycle.txt :");
		String inputText = in.next();
		output.append(inputText);
		output.close();
		in.close();
	}
}
