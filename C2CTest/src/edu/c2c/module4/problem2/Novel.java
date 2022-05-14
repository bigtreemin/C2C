package edu.c2c.module4.problem2;

public class Novel extends Book{

	private String primaryCharacters;
	private String author;

    public Novel(String primaryCharacters,int publishedYear, String bookTitle, int numberOfPages, String author) {
    	super(bookTitle, numberOfPages);
        this.primaryCharacters = primaryCharacters;
        this.author = author;
    }

    public String getPrimaryCharacters() {
        return primaryCharacters;
    }

    public void setPrimaryCharacters(String primaryCharacters) {
        this.primaryCharacters = primaryCharacters;
    }

    public void printInfo() {
        System.out.println("The novel has " + this.getNumberOfPages() + " pages was written by " + this.author);
        System.out.println("The novel title is " + this.getTitle());
        System.out.println("The main character is " + primaryCharacters);
    }
}
