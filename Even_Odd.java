package java_programs;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur name");
		String name = sc.nextLine();
		String c = "";
		do {
			System.out.println("Enter number: ");
			number = sc.nextInt();
			if (number % 2 == 0) {
				System.out.println("Number is Even");
			} else {
				System.out.println("Number is not even");
			}

			System.out.println("Do you want to continue y or n");
			c = sc.nextLine();
			System.out.println(c);
		} while (c.equalsIgnoreCase("Y"));
	}
}
