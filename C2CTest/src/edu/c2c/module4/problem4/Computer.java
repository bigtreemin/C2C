package edu.c2c.module4.problem4;

public class Computer extends Electronics{

	
	public Computer(double weight, double cost, double powerusage, String manufacturer) {
		super(weight, cost, powerusage, manufacturer);
	}

	public void printInfo() {
		System.out.println("The computer information: " + super.toString());
	}
	
}
