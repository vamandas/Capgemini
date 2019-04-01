package day3_22march_111010_FS;

import java.util.Scanner;

public class CalculateElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculating your Electricity Bill!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Previous Input:");
		String previousInput = sc.nextLine();
		System.out.println("Enter the Current Input:");
		String currentInput = sc.nextLine();
		System.out.println("Enter the cost per unit.");
		int cost = sc.nextInt();
		int preInput = Integer.parseInt(previousInput.substring(5));
		int currInput = Integer.parseInt(currentInput.substring(5));
		System.out.println(UserMainCode.calculateElectricityBill(preInput, currInput, cost));
		
	}

}
