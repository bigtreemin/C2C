package edu.c2c.module4.problem3;

public class MainDriver {

	public static void main(String[] args) {
		
		//instance departments with add parameters
		Department1 department1 = new Department1("Annandale Campus", 1);
		Department2 department2 = new Department2("Woodbridge Campus", 2);

		//instance course math with add parameters
		Department1 math = new Math("Mathematics", 1, "Calculus with analytical geometry", 111,
				"math course");

		//instance course English with add parameters
		Department2 english = new English("English", 1, "Writing and Speaking", 222, "english course");

		//instance course history with add parameters
		Department2 history = new History("History", 1, "History of Western Civilization", 333,
				"history course");

		//print department information
		department1.printInfo();
		//print Math course for department1
		math.printInfo();
		System.out.println("-------------------------------");
		department2.printInfo();
		//print English course for department1
		english.printInfo();
		//print History course for department1
		history.printInfo();

	}

}
