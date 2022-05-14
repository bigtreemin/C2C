package edu.c2c;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PirstProgram {
	
	public static void main(String[] args) throws java.io.IOException {

		String name = "Min Zhou";
		String address = "4153 Novar Dr, Chantilly VA 20148";
		String telephoneNumber="571-375-5555";
		
		
		double x, x1, x2,z,y;
		x = 20;
		x1 = 30;
		z=6;
		
		x2 = (x1 + x) / 2;

		y= (x+5)/(x1 -z);
		
		System.out.println("x is " + x);
		System.out.println("x1 is " + x1);
		System.out.println("x2 result is " + x2);
		
		System.out.println("z is " + z);
		System.out.println("y result is " + y);
		
		System.out.println("--------------");
		
		System.out.println("my name is " + name);
		System.out.println("my address is " + address);
		System.out.println("my telephone Number is " + telephoneNumber);
		
		System.out.println("How to print PI " + Math.PI);
		System.out.println("How to print power " + Math.pow(10, 4));
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		//LocalDateTime d = LocalDateTime.parse("2021-07-19T00:00",formatter);
		
		LocalDate dd = LocalDate.parse("2021-07-19",formatter);
		
		LocalDateTime d = dd.atStartOfDay();
		System.out.print("-------- "+ dd);
		
		System.out.print("-------- "+ d);
	}
}
