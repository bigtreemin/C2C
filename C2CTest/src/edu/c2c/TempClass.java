package edu.c2c;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TempClass {
	 private static int t;
	 
	 

	 public static void main(String[] args) {
		 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		 LocalDate dd = LocalDate.parse("2022-05-27",formatter);
		 
		 dd= dd.plusDays(14);
		 
	     System.out.println(dd.getDayOfWeek().getValue());
	     
	     LocalDateTime startOfDay = dd.atTime(LocalTime.MAX);
	     
	     System.out.println("startOfDay " + startOfDay);
	 }
}
