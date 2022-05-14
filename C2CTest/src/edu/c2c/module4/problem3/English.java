package edu.c2c.module4.problem3;

public class English extends Department2 {

	public String title;
	public int number;
	public String description;

	// parameter constructor
	public English(String name, int numberCourses, String title, int number, String description) {
		super(name, numberCourses);
		this.title = title;
		this.number = number;
		this.description = description;
	}


	public void printInfo() {
		System.out.println("The course title is : "+ title);
		System.out.println("Course number is "+ number);
		System.out.println("Description of the course is "+ description);
		System.out.println("");
	}
}
