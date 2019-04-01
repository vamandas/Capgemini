package day4_25march_111010_FS;

import java.util.Scanner;

public class InningsDelivery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Innings.");
		int ni = sc.nextInt();
		Innings[] innings = new Innings[ni];
		InningsBO ibo = new InningsBO();
		for(int i=0,j=1;i<ni;i++,j++) {
			System.out.println("Enter the Innings " + j + " details.");
			String data = sc.next();
			innings[i] = ibo.createInnings(data);
		}
		System.out.println("Enter the number of deliveries.");
		int nd = sc.nextInt();
		Delivery[] d = new Delivery[nd];
		DeliveryBO dbo = new DeliveryBO();
		for(int i=0,j=1;i<nd;i++,j++){
			System.out.println("Enter the Innings " + j + "details.");
			String data = sc.next();
			d[i] = dbo.createDelivery(data, innings);
		}
		System.out.println("Enter the delivery number for which you need to find the innings number");
		int dn = sc.nextInt();
		System.out.println(dbo.findInningsNumber(d, dn));
	}

}