package edu.c2c.module4.problem4;

public class Camera extends Electronics{
	
	
	public Camera(double weight, double cost, double powerusage, String manufacturer) {
		super(weight, cost, powerusage, manufacturer);
		
	}

	public void printInfo() {
		System.out.println("The camera information: " + super.toString());
	}

}
