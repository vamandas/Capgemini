package day3_22march_111010_FS;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be validated.");
		String str = sc.nextLine();
		if(UserMainCode.validatePassword(str)==1)
			System.out.println("Valid Password");
		else
			System.out.println("Invalid Password");
	}

}
