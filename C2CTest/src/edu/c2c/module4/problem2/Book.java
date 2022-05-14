package edu.c2c.module4.problem2;

public class Book {

	private String title;

	private int numberOfPages;
	
	public Book(String title, int numberOfPages) {
		this.title = title;
		this.numberOfPages = numberOfPages;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}


	public void printInfo() {
        System.out.println("This book has " + numberOfPages + " pages");
        System.out.println("The title is " + title);
    }
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", numberOfPages=" + numberOfPages + "]";
	}
	

	
}
