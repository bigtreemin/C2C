package edu.c2c.module3.problem1;

import java.util.Scanner;

public class Locker {

	private int lockerNumber;
	private String studentName;
	private int numberOfBooks;

	private CombinationLock combLock;

	// Instance scanner
	static Scanner in = new Scanner(System.in);

	public Locker() {
		combLock = new CombinationLock();
		lockerNumber = 0;
		studentName = "No Name";
		numberOfBooks = 0;
		combLock.resetDial();
	}

	public Locker(int lockerNumber, String studentName, int numberOfBooks, CombinationLock combLock) {
		this.lockerNumber = lockerNumber;
		this.studentName = studentName;
		this.numberOfBooks = numberOfBooks;
		this.combLock = combLock;
	}

	public int getLockerNumber() {
		return lockerNumber;
	}

	public void setLockerNumber(int lockerNumber) {
		this.lockerNumber = lockerNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}

	public CombinationLock getaCombLock() {
		return combLock;
	}

	public void setaCombLock(CombinationLock aCombLock) {
		this.combLock = aCombLock;
	}

	public void setaCombLock(int number1, int number2, int number3) {

		this.combLock.setNumber1(number1);
		this.combLock.setNumber1(number2);
		this.combLock.setNumber1(number3);
	}

	public void putBookInLocker() {
        if(combLock.getOpenStatus()==3) {
		    numberOfBooks = numberOfBooks + 1;
        }else {
        	System.out.println("The locker is not open, you can not add a book.");
        }
	}

	public void removeBookFromLocker() {
		
		if(combLock.getOpenStatus() == 3) {
			if(numberOfBooks > 0 ) {
				numberOfBooks = numberOfBooks - 1;
			}else {
				System.out.println("You cannot remove a book due to there is no book on the locker.");
			}
		}else {
			System.out.println("The locker is not open, you can not remove a book.");
		}

	}

	public void openLocker() {
		System.out.print("Please input first number: ");
		int input1 = in.nextInt();

		System.out.print("Please input second number: ");
		int input2 = in.nextInt();

		System.out.print("Please input third number: ");
		int input3 = in.nextInt();

		boolean isOpen = combLock.openLock(input1, input2, input3);
		
		if (isOpen)
			System.out.println("The lock "+ lockerNumber +" is open.");
		else
			System.out.println("The numbers you input for "+ studentName +"'s locker are incorrect, Please try again.");
		
	}
	

	@Override
	public String toString() {
		return  "The locker of "+ studentName + " number is "+ lockerNumber + ", it's " + combLock.getCombinStatus() + ", has "+ numberOfBooks + " books " ;
	}

}
