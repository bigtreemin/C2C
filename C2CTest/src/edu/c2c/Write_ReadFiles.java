package edu.c2c;

import java.io.PrintWriter;
import java.io.FileNotFoundException;

public class Write_ReadFiles
{
	public static void main(String[] args)
	{
		// declare array of flowers and instantiate it
		String[] flowers = {"rose", "tulip", "lily", "azalea", "lilac", "lotus", "sunflower", "daisy"};
		String fileName="bouquet.txt";	// name of the file in which we write data
		// declare PrintWriter object named outputStream
		PrintWriter outputStream =null;	// declare object outside try/catch pair
		// try block to instantiate object of type PrintWriter
		try
		{
			outputStream = new PrintWriter(fileName);	// constructor can throw exception
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error in opening file: " + fileName);
			// you cannot continue without a file, the program should stop
			System.exit(0);
		}
		// output stream is ready to be used 
		// start writing in the file
		// define a string that will be used to write data in the file
		String line = "These are the flowers chosen for mom";
		// write my first line in the file
		outputStream.println(line);
		// write additional lines with names of flowers
		int index=0;
		for(int i=0; i<5; i++)
		{
			// generate a random index up to size of array flowers to pick-up values from it
			index=(int)(Math.random()*flowers.length);
			line=flowers[index];
			outputStream.println(line);
		}
		// at the end of activity, data is written in the file, when output stream closed
		outputStream.close();
	}
}