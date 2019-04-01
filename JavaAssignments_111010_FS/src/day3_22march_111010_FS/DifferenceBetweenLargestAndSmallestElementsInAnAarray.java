package day3_22march_111010_FS;

import java.util.Scanner;

public class DifferenceBetweenLargestAndSmallestElementsInAnAarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array.");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("Enter the elements for the 1st Array.");
		for(int i=0;i<n;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println(UserMainCode.getBigDiff(a, n));		
	}

}
