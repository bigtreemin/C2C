package edu.c2c.module4.problem4;

public class Pager extends Electronics{

	
	public Pager(double weight, double cost, double powerusage, String manufacturer) {
		super(weight, cost, powerusage, manufacturer);
	}

	public void printInfo() {
		System.out.println("The pager information: " + super.toString());
	}
}
