package edu.c2c.module4.problem1;

public class Soccer extends Sport{
	

	//parameter constructor
	public Soccer(String name, int playerNumber) {
		
		super( name, playerNumber);
	}

	@Override
	public String toString() {
		return "Soccer " + super.toString();
	}
	
	
}
