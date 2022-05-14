package edu.c2c.module6.problem2;

public class EncoderDemo {

	public static void main(String[] args) {
		
		SubstitutionCipher substitutionCipher = new SubstitutionCipher(3);
		ShuffleCipher shuffleCipher = new ShuffleCipher(1);
		
		String plainText = "abcdefghij";
		
		String substitutionEncode = substitutionCipher.encode(plainText);
		System.out.println("Shifted message:  " + substitutionEncode);
		
		String shuffledEncode = shuffleCipher.encode(plainText);
		System.out.println("Shuffled message:  " + shuffledEncode);
	}
}
