package java_programs;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		int sum=0;
		while(number!=0)
		{
			int lastdigit=number%10;
			sum=sum+lastdigit;
			number=number/10;

		}
		System.out.println("sum of digit is "+sum);
	}

}
