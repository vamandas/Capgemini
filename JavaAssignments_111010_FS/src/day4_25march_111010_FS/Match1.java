package day4_25march_111010_FS;

public class Match1 {
	String date, teamOne, teamTwo, venue;
	Outcome outcome;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeamOne() {
		return teamOne;
	}
	public void setTeamOne(String teamOne) {
		this.teamOne = teamOne;
	}
	public String getTeamTwo() {
		return teamTwo;
	}
	public void setTeamTwo(String teamTwo) {
		this.teamTwo = teamTwo;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public Outcome getOutcome() {
		return outcome;
	}
	public void setOutcome(Outcome outcome) {
		this.outcome = outcome;
	}
	public Match1(String date, String teamOne, String teamTwo, String venue, Outcome outcome) {
		super();
		this.date = date;
		this.teamOne = teamOne;
		this.teamTwo = teamTwo;
		this.venue = venue;
		this.outcome = outcome;
	}
	@Override
	public String toString() {
		return String.format("%-15s %-15s %-15s %-15s %-30s",date,teamOne,teamTwo,venue,outcome);
	}
	
}
