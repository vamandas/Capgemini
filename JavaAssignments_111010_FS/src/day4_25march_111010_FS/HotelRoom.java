package day4_25march_111010_FS;

public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV, hasWifi;

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}

	int calculateTariff(int costPerSqFeet) {
		return this.numberOfSqFeet * costPerSqFeet;
	}

	int getRatePerSqFeet() {
		return 0;
	}
}
