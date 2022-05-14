package edu.c2c.module1;

/*
 * 
 * 
 */
public class Mod1_Problem3 {

	public enum Directions {
		NORTH(0),SOUTH(1), EAST(2), WEST(3);
		
		public int directionNumber;
		
		Directions(int directionNumber) {
			this.directionNumber = directionNumber;
		}
	}

	public static void main(String[] args) {
		
		//declare the distance after 1 hour drive
		double directDistance = 0.0;
		
		//the original location
		int x =0;
		int y =0;
		
		//the drive speed is 60 miles per hour
		int speed = 60;
		//GPS randomly create new direction every 5 minutes
		int newDirection = 5;
		
		//Every new direction turns
		int turns = speed/newDirection;
		
		int randomNumber;
		for (int i = 1; i < turns; i++) {
			randomNumber = (int)Math.random()*4;
			switch (randomNumber) {
			case 0://NORTH 
				x = x +1;
				break;
			case 1://SOUTH;
				x = x -1;
				break;
			case 2://EAST
				y = y +1;
				break;
			case 3://WEST
				y = y -1;
				break;
			}
			
		}
		x = newDirection * x;
		y = newDirection * y;
		
		//distance between two points (the Pythagorean theorem)
		directDistance = Math.sqrt(x^2 +y^2);
		
		// System.out.println(aDirection)
		System.out.println("The distance between two points is:  "+ directDistance);

	}

}
