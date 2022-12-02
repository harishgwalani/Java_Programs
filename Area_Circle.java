package java_programs;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int radius;
		double area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius: ");
		radius = sc.nextInt();
		area = Math.PI * radius * radius;
		System.out.println("Area of circle is " + area);
	}

}
