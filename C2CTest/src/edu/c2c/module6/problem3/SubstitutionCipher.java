package edu.c2c.module6.problem3;

public class SubstitutionCipher implements MessageEncoder,MessageDecoder {

	int n;

	public SubstitutionCipher(int shift) {
		this.n = shift;
	}

	public String encode(String plainText) {
		String encodeMsg = "";
		for (int i = 0; i < plainText.length(); i++)
			encodeMsg = encodeMsg + shifter(plainText.charAt(i));

		return encodeMsg;
	}
	
	private char shifter(char letter) {
		return (char) (letter + this.n);
	}
	
	public String decode(String cipherText) {
		String decodeMsg = "";
		for (int i = 0; i < cipherText.length(); i++)
			decodeMsg = decodeMsg + unshifter(cipherText.charAt(i));

		return decodeMsg;
	}
	
	private Character unshifter(char letter){
		return (char)(letter - this.n);
	}

	
}