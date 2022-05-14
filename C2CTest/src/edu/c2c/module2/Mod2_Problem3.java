package edu.c2c.module2;

import java.util.Scanner;

/*
 * 
 * A method named inputTempForMonth whose purpose is to input a high and a low temperature for a specific month. 
 * The month and the array of temperatures will both be passed as input arguments to the method. The method will not have a return value.
 * A method named inputTempForYear whose purpose is to input a high and a low temperature for every month of the year. 
 * There are no input arguments for this method, but the method does return a completed multidimensional array of temperatures for the year.
 * A method named calculateAverageHigh whose purpose is to calculate the average high temperature for the year. 
 * This method will take the array of temperatures as input and will return the average high temperature for the year.
 * A method named calculateAverageLow whose purpose is to calculate the average low temperature for the year. 
 * This method will take the array of temperatures as input and will return the average low temperature for the year.
 * A method named findHighestTemp whose purpose is to return the index value of the highest temperature for the year. 
 * If the highest temperature of the year occurs more than once in the year, then the method should return the index of the first month that had the temperature. The method will take the array of temperatures as an input argument and return the index of the highest temperature.
 * A method named findLowestTemp whose purpose is to return the index value of the lowest temperature for the year. 
 * If the lowest temperature of the year occurs more than once in the year, then the method should return the index of the first month that had the temperature. 
 * The method will take the array of temperatures as an input argument and return the index of the lowest temperature.
 * A main method that uses the previous methods to determine the average high temperature, average low temperature, and highest and lowest temperatures for the year. 
 * The main method must print out these average temperatures as well as the month and temperature for the highest and lowest temperatures for the year.

 * 
*/

public class Mod2_Problem3 {

	
	//Instance scanner
	public static Scanner in = new Scanner(System.in);

	//Global variable store the highest and lowest temperatures for each month
	private static int[][] highAndLowTemps;

	//Global variable store 12 month in a year
	private static String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };

	public static void main(String[] args) {

		// high and low temperatures
		int arraylength = 2;
		
		// store the highest and lowest temperatures for each month of the calendar year
		highAndLowTemps = new int[months.length][arraylength];

		//Call input temperatures for each month of the year
		inputTempForYear();
		
		//Call calculateAverageHigh method to get average high temperature of this year
		int averageHighTemp = calculateAverageHigh(highAndLowTemps);
		
		//Call calculateAverageLow method to get average low temperature of this year
		int averageLowTemp = calculateAverageLow(highAndLowTemps);
		
		//Call findHighestTemp method to get the index of the highest temperature month of this year
		int highestTempIndex = findHighestTemp(highAndLowTemps);
		
		//Call findLowestTemp method to get the index of the lowest temperature month of this year
		int lowestTempIndext = findLowestTemp(highAndLowTemps);
		
		//Print out the result
		System.out.println("Average high temperature of this year is " + averageHighTemp);
		System.out.println("Average low temperature of this year is " + averageLowTemp);
		System.out.println(months[highestTempIndex] + " has the higest temperature, which is " + highAndLowTemps[highestTempIndex][0]);
		System.out.println(months[lowestTempIndext] + " has the loweset temperature which is " + highAndLowTemps[lowestTempIndext][1]);
		
		//Close the input stream
		in.close();

	}

	/**
	* Provide input scanner, let user input the highest and lowest temperatures for each month
	* @param monthIndex
	* @param highAndLowTemps
	*/
	private static void inputTempForMonth(int monthIndex, int[][] highAndLowTemps) {
		
		System.out.println("----------------------- " +months[monthIndex] +" --------------------------");
		System.out.print("Input the highest temperature: ");
		highAndLowTemps[monthIndex][0] = in.nextInt();//Store the highest temperature[0] for the month that entered by user

		System.out.print("Input the lowest temperature: ");
		highAndLowTemps[monthIndex][1] = in.nextInt();//Store the lowest temperature[1] for the month that entered by user
		
		System.out.println("");
	}

	/**
	* Get the highest and lowest temperature for each month for this year
	* @return highAndLowTemps
	*/
	private static int[][] inputTempForYear() {

		//loop month
		for (int i = 0; i < months.length; i++)
			inputTempForMonth(i, highAndLowTemps);//Call input scanner for each month

		return highAndLowTemps;//Stored all the highest and lowest temperature for each month  
	}

	/**
	* Calculate the high average temperature for this year
	* @param highAndLowTempsInput
	* @return averageHigh
	*/
	private static int calculateAverageHigh(int[][] highAndLowTempsInput) {
		int highTemp = 0;
		for (int i = 0; i < months.length; i++)
			highTemp = highTemp + highAndLowTempsInput[i][0];

		return (int) highTemp / months.length;//get average high temperature for the year
	}

	/**
	* Calculate the low average temperature for this year
	* @param highAndLowTempsInput
	* @return averageHigh
	*/
	private static int calculateAverageLow(int[][] highAndLowTempsInput) {
		int lowTemp = 0;
		for (int i = 0; i < months.length; i++)
			lowTemp = lowTemp + highAndLowTempsInput[i][1];

		return (int) lowTemp / months.length;
	}

	/**
	* Get the index of the lowest temperature
	* @param highAndLowTempsInput
	* @return highTempIndex
	*/
	private static int findHighestTemp(int[][] highAndLowTempsInput) {
		//initialize the highest temperature
		double highTemp = highAndLowTempsInput[0][0];

		//initialize the month index for highest temperature 
		int highTempIndex = 0;

		//loop moth to get the high temperature and the month index
		for (int i = 0; i < months.length; i++) {
			//compare highest temperature to get highest temperature
			if (highAndLowTempsInput[i][0] > highTemp) {
				highTemp = highAndLowTempsInput[i][0];
				highTempIndex = i;
			}
		}
		//the index of the highest temperature
		return highTempIndex;
	}

	/**
	* Get the index of the lowest temperature
	* @param highAndLowTempsInput
	* @return lowestTempIndex
	*/
	private static int findLowestTemp(int[][] highAndLowTempsInput) {
		//initialize the lowest temperature
		double lowestTemp = highAndLowTempsInput[0][1];

		//initialize the month index for lowest temperature 
		int lowestTempIndex = 0;

		//loop moth to get the high temperature and the month index
		for (int i = 0; i < months.length; i++) {
			//compare low temperature to get lowest temperature
			if (highAndLowTempsInput[i][1] < lowestTemp) {
				lowestTemp = highAndLowTempsInput[i][1];
				lowestTempIndex = i;
			}
		}
        //the index of the lowest temperature
		return lowestTempIndex;
	}
}
