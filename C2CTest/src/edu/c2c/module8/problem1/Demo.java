package edu.c2c.module8.problem1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {

		Fraction frac1 = new Fraction(2, 3);

		try {
			FileOutputStream outFile = new FileOutputStream("SerialF.dat");
			ObjectOutputStream objOutput = new ObjectOutputStream(outFile);
			objOutput.writeObject(frac1);
			objOutput.close();
			outFile.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		FileInputStream inFile;
		try {
			
			inFile = new FileInputStream("SerialF.dat");
			ObjectInputStream objInput = new ObjectInputStream(inFile);
			Object obj = objInput.readObject();
			objInput.close();
			inFile.close();
			System.out.println((Fraction) obj);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("No Fraction class found!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
