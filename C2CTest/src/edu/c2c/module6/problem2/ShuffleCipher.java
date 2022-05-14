package edu.c2c.module6.problem2;

public class ShuffleCipher implements MessageEncoder {

	int n;

	public ShuffleCipher(int n) {
		this.n = n;
	}

	public String encode(String plainText) {

		String newString = plainText;
		for (int i = 0; i < n; i++) {
			newString = shuffler(newString);
		}
		return newString;
	}

	private String shuffler(String message) {
		String shuffled = "";
		int mid = message.length()/2;
		String first = message.substring(0, mid);
		String second = message.substring(mid, message.length());
		
		for(int i=0;i<first.length(); i++){
			shuffled = shuffled + first.charAt(i) + second.charAt(i);
		}
		
		if(second.length() > first.length()){
			shuffled = shuffled + second.charAt(second.length()-1);
		}
		
		return shuffled;
	}
}
