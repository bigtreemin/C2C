package edu.c2c.module4.problem4;

public class Electronics {

	private double weight = 0.0;
	private double cost = 0.0;
	private double powerusage= 0.0;
	public String manufacturer;
	
	public Electronics(double weight, double cost, double powerusage, String manufacturer) {
		
		this.weight = weight;
		this.cost = cost;
		this.powerusage = powerusage;
		this.manufacturer = manufacturer;
	}

	@Override
	public String toString() {
		return " [weight=" + weight + ", cost=" + cost + ", powerusage=" + powerusage + ", manufacturer="
				+ manufacturer + "]";
	}
	
	
}
