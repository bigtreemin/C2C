package edu.c2c.module3.problem4;

import java.util.Scanner;

/*
 * 
 * Accept a string from the keyboard, append string
 * 
 * @author Min Zhou
 * 
*/
public class Builder {

	public static void main(String args[]) {
		
		//Instance scanner
		Scanner in = new Scanner(System.in);
		
		//initial
		StringBuilder builder = new StringBuilder();
		
		System.out.print("Please enter first string: ");
		//get input first string from keyboard
		String firstStr = in.nextLine();
		
		System.out.print("Please enter second string: ");
		//get input second string from keyboard
		String secondStr = in.nextLine();
		
		System.out.print("Please enter Yes to output message : ");
		//get input Yes from keyboard
		String thirdStr = in.nextLine();
		
		//append firstStr
		builder.append(firstStr);
		//append thirdStr
		builder.append(thirdStr);
		//append secondStr
		builder.append(secondStr);
		
		System.out.println();
		System.out.println(builder.toString());
		in.close();
	}
}
