package edu.c2c.module8.problem2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadMe {

	public static void main(String[] args) {

		RandomAccessFile pledge = null;
		try {
			pledge = new RandomAccessFile("pledge.txt", "rw");
			pledge.seek(124);
			System.out.println(pledge.readLine());
			pledge.close();
		} catch (FileNotFoundException e) {

			System.out.println("Having problem opening the file.");
		} catch (IOException e) {

			System.out.println("Having problem accessing the file.");
		} finally {
			System.out.println("Finally block.");
		}
	}
}
