package edu.c2c.module4.problem1;

public class Tennis extends Sport{

	//declare tools for tennis
	private String tool;
	
	//parameter constructor
	public Tennis(String name, int playerNumber, String tool) {
		
		super(name, playerNumber);
		this.tool = tool;
	}

	@Override
	public String toString() {
		return "Tennis "+ super.toString()+" [tool=" + tool + "]";
	}

	
}
