package edu.c2c.module5.problem1;

import java.util.Scanner;

public class CycleDemo {

	// main method
	public static void main(String[] args) {
		
		// instance scanner
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please Enter NumberOfWheels :");
		double numberOfWheels = in.nextDouble();
		
		System.out.print("Please Enter Weight :");
		double weight = in.nextDouble();
		
		Cycle cycle = new Cycle(numberOfWheels, weight);
		
		
		try {
			cycle.getNumberOfWheels();
			cycle.getWeight();
			
		} catch (CustomException e) {
			
			System.out.print("Exception message : " + e);
		}
		
		in.close();

	}
}
