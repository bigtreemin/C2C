package edu.c2c.module4.problem1;

public class Sport {

	//declare sportName
	private String sportName;
	
	//declare playerNumber the the sport
	private int playerNumber;
	
	//non parameter constructor
	public Sport() {
		System.out.println("Sport  ----------------- ");
	}
	//parameter constructor
	public Sport(String name, int playerNumber) {

		this.sportName = name;
		this.playerNumber = playerNumber;

	}

	@Override
	public String toString() {
		return "[sportName=" + sportName + ", playerNumber=" + playerNumber + "]";
	}

}
