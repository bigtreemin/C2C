package edu.c2c.module4.problem2;

public class TechnicalJournal extends Book{

	protected int publishedYear;

    public TechnicalJournal(int publishedYear,String bookTitle, int numberOfPages) {
        super(bookTitle, numberOfPages);
        this.publishedYear = publishedYear;
    }


    public void printInfo() {
       
        System.out.println("The magazine has " + this.getNumberOfPages() + " pages");
        System.out.println("Ttitle is " + this.getTitle());
        System.out.println("It was published in " + publishedYear);
    }


	@Override
	public String toString() {
		return "TechnicalJournal [publishedYear=" + publishedYear + "]";
	}

    
}
