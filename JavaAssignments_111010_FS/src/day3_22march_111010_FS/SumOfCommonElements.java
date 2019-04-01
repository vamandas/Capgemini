package day3_22march_111010_FS;

import java.util.Scanner;

public class SumOfCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length for the 1st Array.");
		int m = sc.nextInt();
		System.out.println("Enter the length for the 2nd Array.");
		int n = sc.nextInt();
		int[] a = new int[m], b = new int[n];
		System.out.println("Enter the elements for the 1st Array.");
		for(int i=0;i<m;i++) {
			a[i]= sc.nextInt();
		}
		System.out.println("Enter the elements for the 2nd Array.");
		for(int i=0;i<n;i++) {
			b[i]= sc.nextInt();
		}
		int sum = UserMainCode.getSumOfIntersection(m, n, a, b); // Sums up the unique pairs.
		if(sum > 0)
			System.out.println(sum);
		else
			System.out.println("No Common Element found.");
	}

}
