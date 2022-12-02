package java_programs;

import java.util.Scanner;

public class Simple_interest {
	public static void main(String[] args) {
		double principle, rate, years;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle Amount");
		principle = sc.nextDouble();
		System.out.println("Enter Rate of interest");
		rate = sc.nextDouble();
		System.out.println("Enter time period");
		years = sc.nextDouble();
		double si = ((principle * rate * years) / 100);
		System.out.println("Simple interest is " + si);

	}
}
