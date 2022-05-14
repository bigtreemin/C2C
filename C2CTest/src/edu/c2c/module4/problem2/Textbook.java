package edu.c2c.module4.problem2;

public class Textbook extends Book{

	private String subject;

    public Textbook(String subject,String bookTitle, int numberOfPages) {
        super(bookTitle, numberOfPages);
        this.subject = subject;
    }


    public void printInfo() {
       
        System.out.println("The textbook has " + this.getNumberOfPages() + " pages");
        System.out.println("It is for " + this.subject );
    }
}
