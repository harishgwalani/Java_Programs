package java_programs;

import java.util.Scanner;

public class Factorial_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,factorial;
		factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			factorial=factorial*i;
		}
	System.out.println("factorial of number is "+factorial);
	}

}
