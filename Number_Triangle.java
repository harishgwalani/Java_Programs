package java_programs;

import java.util.Scanner;

public class Number_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num");
		num = sc.nextInt();
		for (int i = 0; i <= num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println();
		}
	}

}
