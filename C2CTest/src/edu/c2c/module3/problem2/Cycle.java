package edu.c2c.module3.problem2;

/*
 * 
 *Declare integer instance variables numberOfWheels and weight as private.
 *Include a toString() method in the Cycle class.  No set or get methods are included.
 *Create a constructor with two parameters, using the same variable names numberOfWheels and weight in the parameter list.
 * Complete the constructor as necessary.
 *Create a separate application to test the class.
 *Create an object of the Cycle class.
 *Display the properties of the object.
 *
 * @author Min Zhou
 * 
*/


public class Cycle {

	//declare variable
	private int numberOfWheels;
	
	//declare variable
	private int weight;

	/**
	* default constructor 
	*/
	public Cycle() {

		this.numberOfWheels = 100;
		this.weight = 1000;
	}

	/**
	* constructor with two parameters
	* @param numberOfWheels
	* @param weight
	*/
	public Cycle(int numberOfWheels, int weight) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}

	/**
	* toString method
	*/
	@Override
	public String toString() {
		return " [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

	// main method for testing 
	public static void main(String[] args) {
		
		Cycle cycleA = new Cycle(80, 800);
		System.out.println("CycleA" + cycleA);
		

		Cycle cycleB = new Cycle();
		System.out.println("CycleB" + cycleB);
	}
}
