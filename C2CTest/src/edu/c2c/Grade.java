package edu.c2c;

import java.util.Scanner;//import java scanner class

public class Grade {

	public static void main(String[] args) {
		
		double g; //declare average grade variable
		Scanner inputGrade = new Scanner(System.in);// using the scanner.
		int student = 1;//declare student 

		while (student <= 5) {//input 5 students
			//int n=1;
			//double y = ++n;
			
			System.out.println("------> ");
			System.out.println("Enter "+ student + "th student average grade: ");
			g = inputGrade.nextDouble();//using scanner.
			
			if(g < 0 || g > 100) //check the input grade, make sure it is valid
				System.out.println("The input grade "+ g + " is invalid.");
			
			else if(g < 50)
				System.out.println("Grade is F");
			else if(g < 60)
				System.out.println("Grade is D");
			else if(g < 80)
				System.out.println("Grade is C");
			else if(g < 90)
				System.out.println("Grade is B");
			else
				System.out.println("Grade is A ");
			
			//check if the student is passing or not
			if(g > 75)
				System.out.println("The student passed");
			else
				System.out.println("The student failed");
			
			student ++;
		}
		
		inputGrade.close();//close the input

	}
}
