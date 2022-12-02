package java_programs;

import java.util.Scanner;

public class Compound_Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double principle,rate,years;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter principle Amount");
		principle=sc.nextDouble();
		System.out.println("Enter Rate of interest");
		rate=sc.nextDouble();
		System.out.println("Enter time period");
		years=sc.nextDouble();
		double ci=principle*Math.pow((1+(rate/100)), years)-principle;
		System.out.println("Compund interest is "+ci);
		

	}

}
