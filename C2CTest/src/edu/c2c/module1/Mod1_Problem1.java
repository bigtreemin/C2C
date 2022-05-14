package edu.c2c.module1;
import java.util.Scanner;
/*
 * 
 * begin 
 *   import scanner from java.util.
 *   input studentID
 *   chapterNumber = (studentId%3)+3
 *   if chapterNumber == 3
 *   begin
 *	    exerciseNumber = (studentId%3)+1;
 *   end
 *	 else if chapterNumber == 4
 *   begin
 *	    chapterNumber=6;
 *	    exerciseNumber = (studentId%38)+1;
 *   end
 *	 else if(chapterNumber == 5)
 *   begin
 *	    exerciseNumber = (studentId%46)+1;
 *	  
 *   print out the required format string
 * end  
 * 
 */
public class Mod1_Problem1 {

	  public static void main(String[] args) {
		  
	       System.out.println("Please Enter Student ID");
	       
	       //instance scanner
	       Scanner in = new Scanner(System.in);
	       
	       //get student id from the input scanner
	       int studentId = in.nextInt();
	       
	       //get chapterNumber base on the studentID
	       int chapterNumber = (studentId%3)+3;
	       
	       //declare the number of the programming exercise 
	       int exerciseNumber =0;
	       
	       //condition base on the logic
	       if(chapterNumber == 3) {
	    	   exerciseNumber = (studentId%3)+1;
	       } else if(chapterNumber == 4) {
	    	   chapterNumber=6;
	    	   exerciseNumber = (studentId%38)+1;
	       } else if(chapterNumber == 5) {
	    	   exerciseNumber = (studentId%46)+1;
	       }
	       
	       System.out.println("Please enter the page number");
	       
	       //get student id from the input scanner
	       int pageNumber = in.nextInt();
	       
	       // out put the required string
	       System.out.println("Please solve programming exercise " + exerciseNumber + " from chapter "+ chapterNumber+ " from page " + pageNumber);
	       
	       //close the input stream
	       in.close();
	       
	    }

}
