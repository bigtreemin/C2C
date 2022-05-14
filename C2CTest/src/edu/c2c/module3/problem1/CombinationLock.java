package edu.c2c.module3.problem1;

public class CombinationLock {

	private static final int MAX_NUMBERS = 39;
	private int currentPosition = 0;
	private int number1;
	private int number2;
	private int number3;

	private int openStatus = 0; // 0 = closed, 1 = right first ready, 2 = left ready, 3 = open

	public CombinationLock() {
		this.number1 = 0;
		this.number2 = 0;
		this.number3 = 0;
	}

	public CombinationLock(int number1, int number2, int number3) {
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}

	public int getNumber1() {
		return number1;
	}

	public void setNumber1(int number1) {
		this.number1 = number1;
	}

	public int getNumber2() {
		return number2;
	}

	public void setNumber2(int number2) {
		this.number2 = number2;
	}

	public int getNumber3() {
		return number3;
	}

	public void setNumber3(int number3) {
		this.number3 = number3;
	}

	public int getOpenStatus() {
		return openStatus;
	}

	public void setOpenStatus(int openStatus) {
		this.openStatus = openStatus;
	}

	public void resetDial() {
		this.currentPosition = 0;
		this.openStatus = 0;
		this.currentPosition = 0;
	}

	public void turnLeft(int ticks) {
		currentPosition = currentPosition - ticks;
		if (currentPosition < 0) {
			currentPosition = MAX_NUMBERS - currentPosition;
		}
		if (openStatus == 1 && currentPosition == number2)
			openStatus = 2;
		else
			openStatus = 0;
	}

	public void turnRight(int ticks) {
		currentPosition = currentPosition + ticks;
		if (currentPosition > MAX_NUMBERS) {
			currentPosition = currentPosition - MAX_NUMBERS;
		}
		
		if (openStatus == 0 && currentPosition == number1) {
			openStatus = 1;
		} else if (openStatus == 2 && currentPosition == number3) {
			openStatus = 3;
		} else
			openStatus = 0;
	}

	public boolean openLock(int inputSecret1, int inputSecret2, int inputSecret3) {

		resetDial();
		turnRight(inputSecret1);
		turnLeft(inputSecret2);
		turnRight(inputSecret3);

		if (openStatus == 3)
			return true;
		else
			return false;

	}

	public String getCombinStatus() {

		String combinStatus;
		if (openStatus == 0)
			combinStatus = "close";
		else if (openStatus == 1)
			combinStatus = "first number ready";
		else if (openStatus == 2)
			combinStatus = "secone number ready";
		else if (openStatus == 3)
			combinStatus = "open";
		else
			combinStatus = "unknown";

		return combinStatus;
	}

	@Override
	public String toString() {
		return "CombinationLock [number1=" + number1 + ", number2=" + number2 + ", number3=" + number3 + "]";
	}

}
