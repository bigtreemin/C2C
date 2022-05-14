package edu.c2c.module4.problem1;

public class Cycling extends Sport {

	//bike for cycling
	private String device;
	
	//parameter constructor
	public Cycling(String name, int playerNumber, String device) {
		
		super(name, playerNumber);
		this.device = device;
	}

	@Override
	public String toString() {
		return "Cycling "+ super.toString()+" [device=" + device + "]";
	}

	@Override
	public boolean equals(Object cycling) {
		return true;
	}
	
}
