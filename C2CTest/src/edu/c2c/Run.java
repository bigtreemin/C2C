package edu.c2c;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {

//    	System.out.println("==== Example 1 ====");
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String line = in.nextLine();
//            System.out.println(line);
//        }
//
//        System.out.println("==== Example 2 ====");
//        String input = "1 fish 2 fish red fish blue fish";
//        Scanner s = new Scanner(input);
//        System.out.println(s.nextInt());
//        System.out.println(s.next());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());

//        System.out.println("==== Example 1 ====");
//        Scanner in = new Scanner(System.in);
//        while (in.hasNextLine()) {
//            String line = in.nextLine();
//            System.out.println(line);
//        }
//
//        System.out.println("==== Example 2 ====");
//        String input = "1 fish 2 fish red fish blue fish";
//        String[] iuptChars = input.split(" ");
//        int charLengh = 0;
//        while (charLengh < iuptChars.length) {
//        	System.out.println(iuptChars[charLengh]);
//        	charLengh++;
//		}
//        

		File file = new File("title2020.tsv");
		Scanner in = null;
		try {
			in = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
//		for (int i = 0; i < 3; i++) {
//			System.out.println(in.nextLine());
//		}
		
		in.useDelimiter("\t");
		in.nextLine();
		for (int i = 0; i < 3; i++) {
		    System.out.println(in.next());
		}

		in.close();
//		for (int i = 0; i < 3; i++) {
//		System.out.println(in.nextLine());
//		}
//		in.close();
//        for (int i = 0; i < 3; i++) {
//        System.out.println(in.nextLine());
//        }
//        in.close();
//        Scanner s = new Scanner(input);
//        System.out.println(s.nextInt());
//        System.out.println(s.next());
//        System.out.println(s.nextInt());
//        System.out.println(s.next());

	}

}
