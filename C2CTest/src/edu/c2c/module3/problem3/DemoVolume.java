package edu.c2c.module3.problem3;

/*
 * 
 * Display the properties of volume1
 * 
 * @author Min Zhou
 * 
*/
public class DemoVolume {


	public static void main(String args[]) {
		
		//book1
		Book book1 = new Book("Core Java – Fundamentals", "Cay S. Horstmann", 916);
		//book1
		Book book2 = new Book("Core Java - Improvement", "Cay S. Horstmann", 960);
		//book3
		Book book3 = new Book("Core Java - Advanced Features", "Cay S. Horstmann", 960);
		
		//add the 3 books to a array
		Book[] books = new Book[] {book1, book2, book3};
		
		//instance volume
		Volume volume1 = new Volume("volume1 ",books.length,books);
		
		//Display the properties of volume1
		System.out.println(volume1);
	}
	
}
