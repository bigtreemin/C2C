package edu.c2c;
public class Exampl2c {

	//Question: Y=sqrt( e^-a pi t +sin( 2x10^6 pi t)/ |(e^( -a+2) pi t ) +10(cos( ( 2 pi x 10^6 t)))|
	public static void main(String[] args) {
		//declare variables
		double t = 0.002;
		double a = 0.05;
		double pi = Math.PI;
		
		//numerator set up
		double power1 = -a *pi *t;
		double powerOfE1 = Math.exp(power1);
		
		double q = 2 *Math.pow(10, 6) *pi *t;
		double sinQ = Math.sin(q);
		
		double numerator= Math.sqrt(powerOfE1 + sinQ);
		
		//denominator
		double power2= (-a+2) *pi *t;
		double powerOfE2 = Math.exp(power2); 
		
		double cQ= 2 *pi *Math.pow(10, 6) *t;
		double cosQ = Math.cos(cQ);
		double eAndCos = 10 * cosQ;
		
		double denominator = Math.abs(powerOfE2 + eAndCos);
		
		//calculation
		double y= numerator/denominator;
		//print the result
		System.out.println("The calculated result y = " + y);
	}

}
