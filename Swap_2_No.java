package java_programs;

import java.util.Scanner;

public class Swap_2_No {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		a = sc.nextInt();
		System.out.println("Enter Second number: ");
		b = sc.nextInt();
		System.out.println("Before Swapping value of variable a and b resp " + a + " " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swapping value of variable a and b resp " + a + " " + b);
	}

}
