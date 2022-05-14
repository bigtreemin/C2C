package edu.c2c.module4.problem3;

public class Department2 extends Categories{


	public int numberCourses;

	public Department2(String name, int numberCourses) {
		super(name);
		this.numberCourses = numberCourses;
	}
	

	public void printInfo() {
		System.out.println("Department of "+ name);
		System.out.println("Number of courses in  the department "+ numberCourses);
	}
}
