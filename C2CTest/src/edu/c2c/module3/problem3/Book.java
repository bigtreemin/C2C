package edu.c2c.module3.problem3;

/*
 * 
 * Book Object with the following properties Title, Author, numberOfPages, 
 * The only methods necessary in the Book class, for this exercise, are the constructor and a toString()
 * 
 * @author Min Zhou
 * 
*/
public class Book {

	//Book title
	private String title;
	//The author of the book
	private String author;
	//The number page of the book
	private int numberOfPages;
	
	//default constructor
	public Book(){
		this.title="";
		this.author="";
		this.numberOfPages=0;
	}
	
	//constructor
	public Book(String title, String author, int numberOfPages) {
		
		this.title = title;
		this.author = author;
		this.numberOfPages = numberOfPages;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", numberOfPages=" + numberOfPages + "]";
	}
	
	
	
	
}
