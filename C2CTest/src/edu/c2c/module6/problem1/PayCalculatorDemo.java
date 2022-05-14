package edu.c2c.module6.problem1;

import java.math.BigDecimal;

public class PayCalculatorDemo {
	
	public static void main(String [] args) {
		
		BigDecimal payRate = new BigDecimal(15);
		
		RegularPay rp = new RegularPay(payRate);
		System.out.println("RegularPay  " + rp.computePay(20));
		
		PayCalculator pay = new HazardPay(payRate);
		System.out.println("HazardPay  " + pay.computePay(20));
		
	}

}
