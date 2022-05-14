package edu.c2c;

import java.math.BigInteger;

/**
 * A BigInteger that allows comma-separated strings.
 * 
 * @author
 * @version
 */
@SuppressWarnings("serial")
public class MyBigInt extends BigInteger {

    /**
     * Constructs a MyBigInt from the given string.
     * 
     * @param val decimal representation of MyBigInt
     */
    public MyBigInt(String val) {
        // remove comma characters
        super(val.replace(",", ""));
    
    }

    public boolean isPalindrome() {
    	String str = super.toString();
    	final int N = str.length();
    	// check each pair of digits
    	for (int i = 0; i < N / 2; i++) {
    	int j = N - 1 - i;
    	if (str.charAt(i) != str.charAt(j)) {
    	return false;
    	}
    	}
    	return true;
    }
    
    public MyBigInt reverse() {
    	String str = super.toString();
    	final int N = str.length();
    	// reverse the digits in the string
    	StringBuilder sb = new StringBuilder(N);
    	for (int i = 0; i < N; i++) {
    	int j = N - 1 - i;
    	sb.append(str.charAt(j));
    	}
    	return new MyBigInt(sb.toString());
    	}
    
    @Override
    public String toString() {
        // start with the decimal representation
        String str = super.toString();
        StringBuilder sb = new StringBuilder(str);

        // insert comma separators every three digits
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }
        return sb.toString();
    }

    /**
     * Example uses of MyBigInt objects.
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {

    }

}