package java_programs;

//WAP To print maximum of three number
import java.util.Scanner;

public class Max_3_Num {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number: ");
		a = sc.nextInt();
		System.out.println("Enter Second number: ");
		b = sc.nextInt();
		System.out.println("Enter third number: ");
		c = sc.nextInt();
		if (a >= b && a >= c) {
			System.out.println(a + " Number is greater than " + b + " " + c);
		} else if (b >= a && b >= c) {
			System.out.println(b + " Number is greater than " + a + " " + c);
		} else {
			System.out.println(c + " Number is greater than " + a + " " + b);
		}
	}

}
