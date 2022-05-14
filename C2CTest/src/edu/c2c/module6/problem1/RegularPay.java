package edu.c2c.module6.problem1;

import java.math.BigDecimal;

public class RegularPay extends PayCalculator {

	public RegularPay(BigDecimal payRate) {
		super(payRate);
	}

	public BigDecimal computePay(float hour) {
		return (this.payRate.multiply(new BigDecimal(hour)));
	}


}
