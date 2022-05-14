package edu.c2c.module3.problem1;

public class LockerDemo {


	public static void main(String[] args) {
		
		//The combination for this locker is 28, 17, 39 
		CombinationLock combination1 = new CombinationLock(28, 17, 39);
		//Creates locker for Mickey Mouse
		Locker locker1 = new Locker(100, "Mickey Mouse", 3, combination1);
		//Object a = locker1;
		//Try to open the locker
		locker1.openLocker();
		//try to put a book into the locker
		locker1.putBookInLocker();
		//print out the locker status
		System.out.println(locker1);
		
		System.out.println("");
		
		//The combination for this locker is 28, 17, 39 
		CombinationLock combination2 = new CombinationLock(36, 16, 27);
		//Create locker for Donald Duck
		Locker locker2 = new Locker(275, "Donald Duck", 0, combination2);
		//try to remove a book into the locker
		locker2.removeBookFromLocker();
		//print out the locker status
		System.out.println(locker2);
		

	}
}
