package edu.c2c.module6.problem3;

import java.util.Scanner;

public class EncoderDemo {

	public static void main(String[] args) {

		SubstitutionCipher substitutionCipher = new SubstitutionCipher(3);
		ShuffleCipher shuffleCipher = new ShuffleCipher(1);
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter encodeMessage: ");
		String plainText = in.nextLine();
		String substitutionEncode = substitutionCipher.encode(plainText);
		System.out.println("SubstitutionCipher message:  " + substitutionEncode);
		String shuffledEncode = shuffleCipher.encode(plainText);
		System.out.println("ShuffleCipher message:  " + shuffledEncode);
		
		System.out.println();
		
		System.out.print("Please enter decodeMessage for SubstitutionEncode : ");
		String cipherTextSubstitutionEncode = in.nextLine();
		String unSubstitutionEncode = substitutionCipher.decode(cipherTextSubstitutionEncode);
		System.out.println("UnSubstitutionCipher message:  " + unSubstitutionEncode);
		
		System.out.println();
		
		System.out.print("Please enter decodeMessage for ShuffleCipher : ");
		String cipherTextShuffleCipher = in.nextLine();
		String unshuffledEncode = shuffleCipher.decode(cipherTextShuffleCipher);
		System.out.println("UnShuffleCipher message:  " + unshuffledEncode);
		
		in.close();
		
	}
}
