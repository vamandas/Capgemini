package day4_25march_111010_FS;

public class DeliveryBO {
	public Delivery createDelivery(String data, Innings [] inningsList) {
		String[] str = data.split(",");
		Long deliveryNumber = Long.parseLong(str[0]);
		String batsman = str[1];
		String bowler = str[2];
		Long runs = Long.parseLong(str[3]);
		Long inningsNumber = Long.parseLong(str[4]);
		Delivery d = new Delivery();
		for(Innings i: inningsList) {
			if(inningsNumber.equals(i.getInningsNumber())) {
				d  = new Delivery(deliveryNumber, batsman, bowler, runs, inningsNumber, i);
			}
		}
		return d;
	}
	
	public String findInningsNumber(Delivery[] delivery, long deliveryNumber) {
		for(Delivery d: delivery) {
			if(deliveryNumber == d.getDeliveryNumber()) {
				return "Innings: " + d.getInningsNumber();
			}
		}
		return "The delivery does not belong to any Innings.";
	}
}