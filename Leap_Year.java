package java_programs;

import java.util.Scanner;

public class Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year: ");
		year = sc.nextInt();
		if(year%400==0||year%100!=0&&year%4==0)
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("not leap year");
		}
	}

}
