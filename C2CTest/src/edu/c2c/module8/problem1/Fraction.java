package edu.c2c.module8.problem1;

import java.io.Serializable;

public class Fraction implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2708418163726255417L;
	private int numerator;
	private int denominator;
	private static char slash= '/';

	public Fraction() {
		super();
	}

	public Fraction(int numerator, int denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	public static char getSlash() {
		return slash;
	}

	public static void setSlash(char slash) {
		Fraction.slash = slash;
	}

	@Override
	public String toString() {
		return "Fraction [numerator=" + numerator + ", denominator="
				+ denominator + "]";
	}

}