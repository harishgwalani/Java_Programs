package java_programs;

import java.util.Scanner;

public class Sum_of_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,temp=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		number = sc.nextInt();
		for(int i=1;i<=number;i++)
		{
			temp=temp+i;
		}
		System.out.println("sum from 1 to "+number+" is "+temp);
	}

}
