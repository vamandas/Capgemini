package day2_21march_111010_fs;

import java.util.Scanner;

public class DigitComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		int n1 = sc.nextInt();	
		System.out.println("Enter another number.");
		int n2 = sc.nextInt();
		if(UserMainClass.compare(n1,n2))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}
}
