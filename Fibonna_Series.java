package java_programs;

import java.util.Scanner;

public class Fibonna_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f1, f2, temp, n;
		f1 = 0;
		f2 = 1;

		System.out.println("enter the number for how many times fabinno series u want");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(f1 + " " + f2);
		for (int i = 0; i < n; i++) {
			temp = f1 + f2;
			System.out.print(" " + temp);
			f1 = f2;
			f2 = temp;

		}
	}

}
