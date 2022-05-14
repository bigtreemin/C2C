package edu.c2c.module4.problem4;

public class Cellphone extends Electronics{

	
	public Cellphone(double weight, double cost, double powerusage, String manufacturer) {
		super(weight, cost, powerusage, manufacturer);
		
	}

	public void printInfo() {
		System.out.println("The cellphone information: " + super.toString());
	}
}
