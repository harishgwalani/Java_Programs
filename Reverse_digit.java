package java_programs;

import java.util.Scanner;

public class Reverse_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		int result=0;
		while(number!=0)
		{
			int lastdigit=number%10;
			result=result*10+lastdigit;
			number=number/10;

		}
		System.out.println("reverse of digit is "+result);
	
	}

}
