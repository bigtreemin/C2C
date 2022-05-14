package edu.c2c.module8.problem3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;


public class ReadWrite {

	public static void main(String [] args) throws FileNotFoundException{
	    Scanner input = new Scanner (System.in);
	    //Creates a new instance of the file
	    File newFile = new File ("Stu.dat");
	    RandomAccessFile newRAFile = null;
	    try {
	    	newRAFile = new RandomAccessFile(newFile, "rw");
	        //Initialize variables
	        int id = 0;
	        double gPA;
	        //Collect IDs and GPAs for 2 students
	        for (int i = 0; i < 2; i++){
	            System.out.println("Please enter the Student ID: ");
	            id = input.nextInt();
	            System.out.println("Please enter the GPA: ");
	            gPA = input.nextDouble();
	            newRAFile.writeInt(id);
	            newRAFile.writeDouble(gPA);
	            newRAFile.writeUTF("\n");
	        }
	        
	        System.out.println("Display the GPA for specific student ID numbers ");
	        boolean isExit= false;
	        while (!isExit){
	            System.out.println("Please enter ID (0 exit): ");
	            id = input.nextInt();
	            if(id == 0) {
	            	isExit = true;
	            }else {
	            	newRAFile.seek(id);
	    			System.out.println(newRAFile.readLine());
				}

	        }
	        newRAFile.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    finally{
	    	input.close();
	        System.out.println("Finally block");
	    }
	}
}
