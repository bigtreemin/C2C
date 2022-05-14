package edu.c2c.module6.problem1;

import java.math.BigDecimal;

public abstract class PayCalculator {

	protected BigDecimal payRate;

	public PayCalculator(BigDecimal payRate) {
		this.payRate = payRate;
	}

	public abstract BigDecimal computePay(float hour);

}
