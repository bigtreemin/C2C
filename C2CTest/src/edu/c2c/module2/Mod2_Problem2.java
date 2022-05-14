package edu.c2c.module2;

import java.util.Scanner;

/*
 * 
 * A method name inputValidScore that inputs one valid score for one judge for one diver. 
 * This method will return the valid score.
 * 
 * A method named inputAllScores that creates an array to store the scores for all judges for the diver. 
 * This method will fill the array with a valid score from each judge. This method does not take input arguments, but it does return the array of scores.
 * 
 * A method named inputValidDegreeOfDifficulty that inputs a valid degree of difficulty for the dive. 
 * The valid degree of difficulty will be returned from the method.
 * 
 * A method named calculateScore that will calculate the score for the diver based on the scores from all judges and the degree of difficulty.
 *  The score will be returned from the method.
 *  
 * A main method that uses the previous methods to determine the score for the diver and then prints out the score to the console.
 * 
*/

public class Mod2_Problem2 {

	//Global variable store judgesScores
	static float judgesScores[];
	//Instance scanner
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//seven judges 
		int judges = 7;
		judgesScores = new float[judges];
		
		//Call inputValidDegreeOfDifficulty method
		Float validatedDegreeOfDifficulty = inputValidDegreeOfDifficulty();
		
		//Make sure validated Degree Of Difficulty inputed by user
		if (validatedDegreeOfDifficulty != null) {

			//Loop enter the 7 judges's score
			for (int i = 0; i < judgesScores.length; i++) {
				System.out.print("Judge #" + Integer.valueOf(i+1) + " score : ");
				judgesScores[i] = inputValidScore();
			}
			//Call inputAllScores method to get all validated scores
			float allValidatedScores[] = inputAllScores();
			
			//Call calculateScore method to get the calculated final score
			float finalScore = calculateScore(allValidatedScores, validatedDegreeOfDifficulty);

			System.out.print("The final score for the diver is  " + finalScore);
		}

		//Close the input stream
		in.close();
	}

	/**
	* Inputs one valid score for one judge for one diver
	* @param Input score
	* @return validated score
	*/
	private static Float inputValidScore() {
		
		float inputScore = in.nextFloat();
		if (inputScore < 0f && inputScore > 10f) {
			System.out.print("The Judge gives invalid score " + inputScore);
			return null;
		}
		return inputScore;

	}

	/**
	* An array to store the scores for all judges for the diver
	* @return All validated score
	*/
	private static float[] inputAllScores() {
		
		//initialize the highest score
		float highestScore = judgesScores[0];
		
		//initialize the lowest score
		float lowestScore = judgesScores[0];

		//loop judgesScores to find the highest score and lowest score
		for (int i = 0; i < judgesScores.length; i++) {
			Float inputValidScore = judgesScores[i];

			if (inputValidScore != null) {
				if (inputValidScore > highestScore)
					highestScore = inputValidScore;

				if (inputValidScore < lowestScore)
					lowestScore = inputValidScore;

			}

		}
		//Array size after remove the highest score and the lowest score
		int removedScoreSize = 7 - 2;
		
		//Array variable to store validatedScores
		float allValidatedScores[] = new float[removedScoreSize];
		
		//loop judgesScores to removed the highest score and the lowest score, and reassign the  allValidatedScores array
		for (int i = 0, k=0; i < judgesScores.length; i++) {
			
			float vaildatedScore = judgesScores[i];
			if (vaildatedScore == highestScore || vaildatedScore == lowestScore)
				  break;
				
			allValidatedScores[k++]	= vaildatedScore;

		}

		return allValidatedScores;

	}

	/**
	* Inputs a valid degree of difficulty for the dive
	* @param Input Difficult Level
	* @return Validated difficult level
	*/
	private static Float inputValidDegreeOfDifficulty() {
		
		System.out.print("Degree of difficulty : ");
		//Input valid Degree Of Difficulty by user
		float difficultLevel = in.nextFloat();
		
		if (difficultLevel < 1.2f && difficultLevel > 3.8f) {
			System.out.print("The entered Degree Of Difficulty Is Invaild " + difficultLevel);
			return null;
		}
		return difficultLevel;
	}

	/**
	* Calculate the score for the diver based on the scores from all judges and the degree of difficulty
	* @param Judges Validated Scores
	* @param Validated Degree Of Difficulty
	* @return Final score
	*/
	private static float calculateScore(float judgesValidatedScores[], float validatedDegreeOfDifficulty) {

		float sumVaidatedScore = 0;
		//sum all vaildatedScore
		for (int i = 0; i < judgesValidatedScores.length; i++)
			sumVaidatedScore = sumVaidatedScore + judgesValidatedScores[i];
		
        //calculate the final score
		return (sumVaidatedScore * validatedDegreeOfDifficulty) * 0.6f;
	}
}
