package edu.c2c.finalProject;

import java.util.Scanner;

public class FinalProgramming {

    public static void main(String a[])
    {
  
        Scanner input = new Scanner(System.in);
  
        System.out.print("Enter the year : ");
  
        int yy = input.nextInt();
  
        System.out.print("Enter month : ");
  
        int mm = input.nextInt();
        
        Calendar calendar = new Calendar(yy, mm);
        
        System.out.println("----------------------------------------- ");
        calendar.printCalendar();
  
        input.close();
    }

	
}
