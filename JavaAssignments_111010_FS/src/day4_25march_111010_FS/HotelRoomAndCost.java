package day4_25march_111010_FS;

import java.util.Scanner;

public class HotelRoomAndCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean hasTV = false, hasWifi = false;
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\n2. Deluxe AC Room\n3. Suite AC Room\n");
		System.out.println("Select Room Type:");
		int roomType = sc.nextInt();
		System.out.println("Hotel Name:");
		String hotelName = sc.next();
		System.out.println("Room Square Feet Area:");
		int numberOfSqFeet = sc.nextInt();
		System.out.println("Room has TV (yes/no)");
		String hastv = sc.next();
		if (hastv.equalsIgnoreCase("yes") || hastv.equalsIgnoreCase("y"))
			hasTV = true;
		System.out.println("Room has WIFI (yes/no)");
		String haswifi = sc.next();
		if (haswifi.equalsIgnoreCase("yes") || haswifi.equalsIgnoreCase("y"))
			hasWifi = true;
		switch (roomType) {
		case 1:
			DeluxeRoom deluxeRoom = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is: " + deluxeRoom.calculateTariff(deluxeRoom.getRatePerSqFeet()));
			break;
		case 2:
			DeluxeACRoom deluxeACRoom = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out.println("Room Tariff per day is: " + deluxeACRoom.calculateTariff(deluxeACRoom.getRatePerSqFeet()));
			break;
		case 3:
			SuiteACRoom suiteACRoom = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
			System.out
					.println("Room Tariff per day is: " + suiteACRoom.calculateTariff(suiteACRoom.getRatePerSqFeet()));
			break;
		default:
			System.out.println("Invalid Room Type! Please select an appropriate Room Type.");
			break;
		}
	}

}
