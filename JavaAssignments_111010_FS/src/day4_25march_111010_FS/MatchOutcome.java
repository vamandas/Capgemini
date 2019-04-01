package day4_25march_111010_FS;

import java.util.Scanner;

public class MatchOutcome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of matches");
		int n = sc.nextInt();
		Match1[] m = new Match1[n];
		boolean displayMenu = true;
		for (int i = 0,j=1; i < n; i++,j++) {
			System.out.println("Enter the Match"+j+" Details.");
			System.out.println("Enter match date");
			String date = sc.next();
			System.out.println("Enter team one");
			String teamOne = sc.next();
			System.out.println("Enter team two");
			String teamTwo = sc.next();
			System.out.println("Enter venue");
			String venue = sc.next();			
			System.out.println("Enter status");
			String status = sc.next();			
			System.out.println("Enter winner Team");
			String winnerTeam = sc.next();
			Outcome outcome = new Outcome(status, winnerTeam);
			Match1 match = new Match1(date, teamOne, teamTwo, venue, outcome);
			m[i] = match;
		}
		Match1BO mbo = new Match1BO();
		while (displayMenu) {
			System.out.println("Menu:\n1. View match details\n2. Filter match details with outcome status\n3. Filter match details with outcome winner team\n4. Exit");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				mbo.printAllMatchDetails(m);
				break;
			case 2:
				System.out.println("Enter outcome status");
				mbo.printMatchDetailsWithOutcomeStatus(m, sc.next());
				break;
			case 3:
				System.out.println("Enter outcome winner team");
				mbo.printMatchDetailsWithOutcomeWinnerTeam(m, sc.next());
				break;
			case 4:
				displayMenu = false;
				break;
			default:
				System.out.println("Invalid Option! Please select an appropriate option.");
				break;
			}
		}
	}

}
