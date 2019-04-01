package day4_25march_111010_FS;

public class Match1BO {

	void printAllMatchDetails(Match1[] MatchList) {
		System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "TeamOne", "TeamTwo", "Venue", "Status", "Winner"));
		for (Match1 m : MatchList) {
			System.out.println(m);
		}
	}

	void printMatchDetailsWithOutcomeStatus(Match1[] MatchList, String outcomeStatus) {
		boolean flag = true;
		int i=0;
		for (Match1 m : MatchList) {
			if (outcomeStatus.equals(m.outcome.getStatus())) {
				flag = false;
				if(i<1 && !flag) {
					System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "TeamOne", "TeamTwo", "Venue", "Status", "Winner"));
					i=1;
				}
				System.out.println(m);
			}
		}
		if (flag)
			System.out.println("Status not found");
	}

	void printMatchDetailsWithOutcomeWinnerTeam(Match1[] MatchList, String outcomeWinnerTeam) {
		boolean flag = true;
		int i=0;
		for (Match1 m : MatchList) {
			if(outcomeWinnerTeam.equals(m.outcome.getWinnerTeam())) {
				flag = false;
				if(i<1 && !flag) {
					System.out.println(String.format("%-15s %-15s %-15s %-15s %-15s %-15s", "Date", "TeamOne", "TeamTwo", "Venue", "Status", "Winner"));
					i=1;
				}
				System.out.println(m);
			}
		}
		if (flag)
			System.out.println("Winner Team not found");
	}
}
