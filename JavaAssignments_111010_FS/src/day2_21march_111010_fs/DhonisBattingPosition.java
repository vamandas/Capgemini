package day2_21march_111010_fs;

import java.util.Scanner;

public class DhonisBattingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int currentOver, noOfBallsPlayed, totalOver;
		System.out.println("Enter the number of overs. ");
		currentOver = sc.nextInt()*6;
		System.out.println("Enter the number of balls played.");
		noOfBallsPlayed = sc.nextInt();
		System.out.println("Enter the total number of overs.");
		totalOver = sc.nextInt()*6;
		if((currentOver+noOfBallsPlayed)>(.75)*totalOver) {
			System.out.println("Yes");
		} else
			System.out.println("No");
		
	}

}
