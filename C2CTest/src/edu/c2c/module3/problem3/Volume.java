package edu.c2c.module3.problem3;

/*
 * 
 * Book Object with the following properties Title, Author, numberOfPages, 
 * The only methods necessary in the Book class, for this exercise, are the constructor and a toString()
 * 
 * @author Min Zhou
 * 
*/
public class Volume {

	//The volume name
	private String volumeName;
	//The number of books
	private int numberOfBooks;
	//Array of the books in the volume
	private Book[] bookArray;

	//constructor
	public Volume(String volumeName, int numberOfBooks, Book[] bookArray) {
		this.volumeName = volumeName;
		this.numberOfBooks = numberOfBooks;
		this.bookArray = bookArray;

	}

	/**
	* returns a string of book properties for each book
	*/
	public String getBookArray() {
		String newline = System.lineSeparator();
		String bookProperties = "";
		for(int i = 0; i< bookArray.length; i++) {
			
			bookProperties = bookProperties + newline + bookArray[i].toString();
		}
		
		return bookProperties;
	}

	@Override
	public String toString() {
		return "Volume [volumeName=" + volumeName + ", numberOfBooks=" + numberOfBooks + ", bookArray="
				+ getBookArray() + "]";
	}

}
