package edu.c2c.module1;

import java.util.Scanner;

/*
 * begin
 * declare the global variable i = Math.pow(-1, 1 / 2);
 * instance scanner
 * real a1 entered by user
 * imaginary b1 entered by user
 * real a2 entered by user
 * real b2 entered by user
 * call addition function
 * addition("Addition", a1,b1,a2,b2);
 * call addition function
 * subtraction("Subtraction", a1,b1,a2,b2);
 * call multiplication function
 * multiplication("Multiplication",a1,b1,a2,b2);
 * get real a1 entered by user
 * division("Division", a1,b1,a2,b2);
 * close the input stream	
 * end
 */
public class Mod1_Problem4 {

	//declare the complex number i
	static double i = Math.pow(-1, 1 / 2);

	public static void main(String[] args) {

		//instance scanner
		Scanner in = new Scanner(System.in);
		
		System.out.println(" Calculating Complex Numbers z1 = a1 + (i*b1) and z2 = a2 + (i*b2)");
		
		System.out.print("Enter real a1: ");
		//get real a1 entered by user
		float a1 = in.nextFloat();
		
		System.out.print("Enter imaginary b1: ");
		//get imaginary b1 entered by user
		float b1 = in.nextFloat();
		
		System.out.print("Enter real a2: ");
		//get real a2 entered by user
		float a2 = in.nextFloat();
		
		System.out.print("Enter imaginary b2: ");
		//get real b2 entered by user
		float b2 = in.nextFloat();
		
		//call addition function
		addition("Addition", a1,b1,a2,b2);
		//call addition function
		subtraction("Subtraction", a1,b1,a2,b2);
		//call multiplication function
		multiplication("Multiplication",a1,b1,a2,b2);
		//get real a1 entered by user
		division("Division", a1,b1,a2,b2);
		
		// close the input stream
		in.close();
	}

	//addition function
	public static void addition(String methodName, float a1,float b1,float a2,float b2) {
		double addValue = (a1 + a2) + i * (b1 + b2);
		System.out.println(methodName + ": " + addValue);
	}

	//subtraction function
	public static void subtraction(String methodName, float a1,float b1,float a2,float b2) {
		double subtract = (a1 - a2) + i * (b1 - b2);
		System.out.println(methodName + ": " + subtract);
	}

	//multiplication function
	public static void multiplication(String methodName, float a1,float b1,float a2,float b2) {
		double multiply = ((a1 * a2) - (b1 * b2)) + i * ((b1 * a2) + (a1 * b2));
		System.out.println(methodName + ": " +  multiply);
	}
    //addition function
	public static void division(String methodName, float a1,float b1,float a2,float b2) {
		double division = ((a1 + (b1 * i)) / (a2 + (b2 * i)));
		System.out.println(methodName  + ": " +  division);
	}

}
