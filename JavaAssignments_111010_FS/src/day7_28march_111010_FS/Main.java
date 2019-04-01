package day7_28march_111010_FS;

import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details of customer 1");
		String[] str1 = sc.nextLine().split(",");
		Customer cust1 = new Customer(Long.parseLong(str1[0].trim()),str1[1].trim(),str1[2].trim(),new Date(str1[3].trim()),Double.parseDouble(str1[4].trim()),Double.parseDouble(str1[5].trim()),new Date(str1[6].trim()),Double.parseDouble(str1[7].trim()));
		System.out.println("Enter the details of customer 2");
		String[] str2 = sc.nextLine().split(",");
		Customer cust2 = new Customer(Long.parseLong(str2[0].trim()),str2[1].trim(),str2[2].trim(),new Date(str2[3].trim()),Double.parseDouble(str2[4].trim()),Double.parseDouble(str2[5].trim()),new Date(str2[6].trim()),Double.parseDouble(str2[7].trim()));
		System.out.println("Details of customer 1:\n"+cust1);
		System.out.println("Details of customer 2:\n"+cust2);
		if(cust1.equals(cust2))
			System.out.println("\nCustomer 1 is same as Customer 2");
		else
			System.out.println("\nCustomer 1 and Customer 2 are different");
	}

}
