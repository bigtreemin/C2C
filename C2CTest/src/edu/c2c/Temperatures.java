package edu.c2c;

import java.util.Scanner;

public class Temperatures {

	public static Scanner keyboard = new Scanner(System.in);

	private static int highTemperature, lowTemperature, averageHigh, averageLow;

	private static int index;// keeps track of months

	private static int indexOfHighestTemp = 0, indexOfLowestTemp = 0;

	private static int[][] highAndLowTemps = new int[12][2];// array for highs and lows

	private static String[] months = new String[12];// array of monthss

	public static void main(String[] args) {

		inputTempForYear();

		calculateAverageHigh(highAndLowTemps);

		calculateAverageLow(highAndLowTemps);

		findHighestTemp(highAndLowTemps);

		findLowestTemp(highAndLowTemps);

        //outputs results

		System.out.println("Average High: " + averageHigh);

		System.out.println("Average Low: " + averageLow);

		System.out.println(
				"Highest Temp and Month: " + highAndLowTemps[indexOfHighestTemp][0] + " " + months[indexOfHighestTemp]);

		System.out.println(
				"Lowest Temp and Month: " + highAndLowTemps[indexOfLowestTemp][1] + " " + months[indexOfLowestTemp]);

	}

	private static void inputTempForMonth(int[][] highAndLowTemps)

	{

		System.out.println("Input the high temperature for " + months[index] + ":");

		highTemperature = keyboard.nextInt();// inputs months high temp

		highAndLowTemps[index][0] = highTemperature;

		System.out.println("Input the low temperature for " + months[index] + ":");

		lowTemperature = keyboard.nextInt();// inputs months low temp

		highAndLowTemps[index][1] = lowTemperature;

	}

	private static int[][] inputTempForYear()

	{

		months[0] = "January";

		months[1] = "Febuary";

		months[2] = "March";

		months[3] = "April";

		months[4] = "May";

		months[5] = "June";

		months[6] = "July";

		months[7] = "August";

		months[8] = "September";

		months[9] = "October";

		months[10] = "November";

		months[11] = "December";// fills month array

		for (index = 0; index <= 11; index++)// fills array with highs and lows

		{

			inputTempForMonth(highAndLowTemps);

		}

		return highAndLowTemps;

	}

	private static int calculateAverageHigh(int[][] highAndLowTemps)

	{

		for (int i = 0; i <= 11; i++)// finds sum of high temps

		{

			averageHigh = averageHigh + highAndLowTemps[i][0];

		}

		averageHigh /= 12;// calculates average

		return averageHigh;

	}

	private static int calculateAverageLow(int[][] highAndLowTemps)

	{

		for (int i = 0; i <= 11; i++)// finds sum of low temps

		{

			averageLow = averageLow + highAndLowTemps[i][1];

		}

		averageLow /= 12;// calculates average

		return averageLow;

	}

	private static int findHighestTemp(int[][] highAndLowTemps)

	{

		double max = highAndLowTemps[0][0];

		int indexHigh;// index for highest

		for (indexHigh = 0; indexHigh < 11; indexHigh++)// find highest high temp

		{

			if (highAndLowTemps[indexHigh][0] > max)

			{

				max = highAndLowTemps[indexHigh][0];

				indexOfHighestTemp = indexHigh;

			}

		}

		return indexOfHighestTemp;

	}

	private static int findLowestTemp(int[][] highAndLowTemps)

	{

		double min = highAndLowTemps[0][1];

		int indexLow;// index for lowest

		for (indexLow = 0; indexLow < 11; indexLow++)// finds lowest low temp

		{

			if (highAndLowTemps[indexLow][1] < min)

			{

				min = highAndLowTemps[indexLow][1];

				indexOfLowestTemp = indexLow;

			}

		}

		return indexOfLowestTemp;

	}

}