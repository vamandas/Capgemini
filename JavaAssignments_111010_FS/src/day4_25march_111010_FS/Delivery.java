package day4_25march_111010_FS;

public class Delivery {
	private Long deliveryNumber;
	private String batsman;
	private String bowler;
	private Long runs;
	private Long inningsNumber;
	private Innings innings;
	public Long getDeliveryNumber() {
		return deliveryNumber;
	}
	public void setDeliveryNumber(Long deliveryNumber) {
		this.deliveryNumber = deliveryNumber;
	}
	public String getBatsman() {
		return batsman;
	}
	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}
	public String getBowler() {
		return bowler;
	}
	public void setBowler(String bowler) {
		this.bowler = bowler;
	}
	public Long getRuns() {
		return runs;
	}
	public void setRuns(Long runs) {
		this.runs = runs;
	}
	public Long getInningsNumber() {
		return inningsNumber;
	}
	public void setInningsNumber(Long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}
	public Innings getInnings() {
		return innings;
	}
	public void setInnings(Innings innings) {
		this.innings = innings;
	}
	public Delivery(Long deliveryNumber, String batsman, String bowler, Long runs, Long inningsNumber,
			Innings innings) {
		super();
		this.deliveryNumber = deliveryNumber;
		this.batsman = batsman;
		this.bowler = bowler;
		this.runs = runs;
		this.inningsNumber = inningsNumber;
		this.innings = innings;
	}
	public Delivery() {
		// TODO Auto-generated constructor stub
	}	
}
