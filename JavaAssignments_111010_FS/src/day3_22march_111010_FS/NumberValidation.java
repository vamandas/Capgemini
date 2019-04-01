package day3_22march_111010_FS;

import java.util.Scanner;

public class NumberValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be validated.");
		String str = sc.nextLine();
		if(UserMainCode.validateNumber(str)==1)
			System.out.println("Valid Number Format");
		else
			System.out.println("Invalid Number Format");
	}

}
