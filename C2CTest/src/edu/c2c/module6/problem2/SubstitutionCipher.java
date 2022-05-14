package edu.c2c.module6.problem2;

public class SubstitutionCipher implements MessageEncoder {

	int n;

	public SubstitutionCipher(int shift) {
		this.n = shift;
	}

	public String encode(String plainText) {
		String shiftedString = "";
		for (int i = 0; i < plainText.length(); i++)
			shiftedString = shiftedString + shifter(plainText.charAt(i));

		return shiftedString;
	}

	private char shifter(char letter) {
		return (char) (letter + this.n);
	}
}