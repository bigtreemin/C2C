package edu.c2c;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CC {
	int number = Integer.MAX_VALUE + 1;
	public static void main(String[] args) {
		int number = Integer.MAX_VALUE + 1;
		  System.out.println(number);
		 }

		 static void method() throws Exception {
		  try {
		   String s = "5.6";
		   Integer.parseInt(s); // Cause a NumberFormatException

		   int i = 0;
		   int y = 2 / i;
		   System.out.println("Welcome to Java"); 
		  }
		  catch (NumberFormatException ex) {
		   System.out.println("NumberFormatException");
		   throw ex;
		  }
		  catch (RuntimeException ex) {
		   System.out.println("RuntimeException");
		  } 
		 }
}
