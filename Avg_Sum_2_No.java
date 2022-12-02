package java_programs;

import java.util.Scanner;

public class Avg_Sum_2_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, sum;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		a = sc.nextInt();
		System.out.println("Enter Second number: ");
		b = sc.nextInt();
		sum = a + b;
		avg = (float) (sum / 2.0);
		System.out.println("Sum of two number is " + sum);
		System.out.println("Avg of two number is " + avg);
	}

}
