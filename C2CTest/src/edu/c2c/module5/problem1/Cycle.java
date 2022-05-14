package edu.c2c.module5.problem1;

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
	private double numberOfWheels;
	
	//declare variable
	private double weight;

	/**
	* default constructor 
	*/
	public Cycle() {

		this.numberOfWheels = 100.0;
		this.weight = 1000.0;
	}

	/**
	* constructor with two parameters
	* @param numberOfWheels
	* @param weight
	*/
	public Cycle(double numberOfWheels, double weight) {
		super();
		this.numberOfWheels = numberOfWheels;
		this.weight = weight;
	}

	public double getNumberOfWheels() throws CustomException {
		if(numberOfWheels<=0.00)
			 throw new CustomException("Values cannot be less than or equal to zero");
		
		return numberOfWheels;
	}

	public void setNumberOfWheels(double numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getWeight() throws CustomException {
		
		if(weight<=0.00) 
			 throw new CustomException("Values cannot be less than or equal to zero");
		
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	* toString method
	*/
	@Override
	public String toString() {
		return " [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

}
