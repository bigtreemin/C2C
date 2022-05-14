package edu.c2c.module4.problem1;

public class MainSport extends Object{

	public static void main(String[] args) {
		
		 Sport sport1, sport2, sport3;

		 //new soccer instance with parameter contractor
		 sport1 = new Soccer("Soccer", 22);

		 //new tennis instance with parameter contractor
		 sport2 = new Tennis("Tennis",2, "Racquet");

		 //new cycling instance with parameter contractor
		 sport3 = new Cycling("Cycling", 1, "Bike");
	
		 System.out.println(sport1);
		 System.out.println(sport2);
		 System.out.println(sport3);
		 
	}
}
