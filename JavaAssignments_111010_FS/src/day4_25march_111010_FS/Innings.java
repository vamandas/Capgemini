package day4_25march_111010_FS;

public class Innings {
	private Long inningsNumber;
	private String battingTeam;
	public Long getInningsNumber() {
		return inningsNumber;
	}
	public void setInningsNumber(Long inningsNumber) {
		this.inningsNumber = inningsNumber;
	}
	public String getBattingTeam() {
		return battingTeam;
	}
	public void setBattingTeam(String battingTeam) {
		this.battingTeam = battingTeam;
	}
	public Innings(Long inningsNumber, String battingTeam) {
		super();
		this.inningsNumber = inningsNumber;
		this.battingTeam = battingTeam;
	}
}