package day2_21march_111010_fs;

import java.util.Scanner;

public class BattingKeeping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isCoachAvailable;
		Scanner sc = new Scanner(System.in);
		System.out.println("Is coach available? ");
		isCoachAvailable = sc.next();
		if(isCoachAvailable.equalsIgnoreCase("yes")) {
			System.out.println("Keeping");
		} else if(isCoachAvailable.equalsIgnoreCase("no")) {
			System.out.println("Batting");
		} else
			System.out.println("Invalid Input");
	}

}