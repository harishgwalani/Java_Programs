package java_programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,j;
		j=1;
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		number = sc.nextInt();
		while(j<=number)
		{
			if(number%j==0)
			{
				flag++;
			}
			j++;
		}
		if(flag==2)
		{
			System.out.println("number is prime");
		}
		else
		{
			System.out.println("not prime");
		}

	}

}
