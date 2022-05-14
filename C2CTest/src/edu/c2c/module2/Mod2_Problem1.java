package edu.c2c.module2;

import java.util.Scanner;


/*
 * 
 * a. 0 to 10 boxes
 * b. 11 to 20 boxes
 * c. 21 to 30 boxes
 * d. 31 to 40 boxes
 * e. 41 or more boxes
 * The number of boxes sold for each Girl Scout will be entered at the keyboard
 * The total number of girls in the troop selling cookies will also be entered at the keyboard
 * Print out to the console with a table format
 * 
*/


public class Mod2_Problem1 {

	public static void main(String[] args) {
		
		//instance scanner
		Scanner in = new Scanner(System.in);
		
        //print out table rows
		int tableRows = 5;
		
		//store the boxes of cookies sold by each girl
		int[] boxesSolds = new int[tableRows];
		System.out.print("Total number of girls in the troop: ");
		
		//Keyboard input the total number of girls in the troop selling cookies 
		int numOfGirls = in.nextInt();

		//loop adding the cookies to boxesSolds array with following category condition
		for (int i = 1; i <= numOfGirls; i++)
		{

			System.out.print("Boxes of cookies for girl #" + i+1 + ": ");
			//keyboard input the number of boxes sold for each Girl Scout
			int boxesold = in.nextInt();

            //0 to 10 boxes
			if (boxesold >= 0 && boxesold <= 10)
				boxesSolds[0]++;//adding to category a
			//11 to 20 boxes
			else if (boxesold >= 11 && boxesold <= 20)
				boxesSolds[1]++;//adding to category b
			//21 to 30 boxes
			else if (boxesold >= 21 && boxesold <= 30)
				boxesSolds[2]++;//adding to category c
			//31 to 40 boxes
			else if (boxesold >= 31 && boxesold <= 40)
				boxesSolds[3]++;//adding to category d
			//40 to more boxes
			else if (boxesold > 40)
				boxesSolds[4]++;//adding to category e

		}

		//Close the input stream
		in.close();

		System.out.println("");

		System.out.println("TOTAL BOXES	|	NUMBER OF GIRL SCOUTS");
		System.out.println("-----------------------------------------");
		System.out.println("0 to 10		|	" + boxesSolds[0]);
		System.out.println("-----------------------------------------");
		System.out.println("11 to 20	|	" + boxesSolds[1]);
		System.out.println("-----------------------------------------");
		System.out.println("21 to 30	|	" + boxesSolds[2]);
		System.out.println("-----------------------------------------");
		System.out.println("31 to 40	|	" + boxesSolds[3]);
		System.out.println("-----------------------------------------");
		System.out.println("41 or more	|	" + boxesSolds[4]);
		System.out.println("-----------------------------------------");

	}

}
