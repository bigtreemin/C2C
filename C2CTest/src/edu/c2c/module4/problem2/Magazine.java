package edu.c2c.module4.problem2;

public class Magazine extends Book{
 

	private String topic;
    private String genre;

    public Magazine(String topic, String genre,String title, int numberOfPages) {
 		 super(title, numberOfPages);
         this.topic = topic;
         this.genre = genre;
 	}

    public void printInfo() {
        System.out.println("The magazine has " + this.getNumberOfPages() + " pages" );
        System.out.println("Title is " + this.getTitle());
        System.out.println("The genre is" + genre + " featured topic is " + topic);
    }

	@Override
	public String toString() {
		return "Magazine [topic=" + topic + ", genre=" + genre + ", getTitle()=" + getTitle() + ", getNumberOfPages()="
				+ getNumberOfPages() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
    

}
