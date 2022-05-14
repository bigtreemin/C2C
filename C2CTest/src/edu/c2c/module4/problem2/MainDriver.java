package edu.c2c.module4.problem2;

public class MainDriver {
	
	public static void main(String[] args) {

        Book novel = new Novel("Atticus Finch",1960, "To kill a mockingbird",400,"Harper Lee");
        novel.printInfo();

        System.out.println("--------------------------");
        
        Book magazine = new Magazine("Shonen JUMP", "Japanese manga","manga", 250);
        magazine.printInfo();

        System.out.println("--------------------------");
        
        Book technicalJournal = new TechnicalJournal(1983,"NEWTON",350);
        technicalJournal.printInfo();
        System.out.println("--------------------------");
        
        Book textbook = new Textbook("Java", "Textbook for C2C", 120);
        textbook.printInfo();

    }
}
