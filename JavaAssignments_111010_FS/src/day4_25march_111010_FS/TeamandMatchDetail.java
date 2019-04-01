package day4_25march_111010_FS;

import java.util.Scanner;

public class TeamandMatchDetail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Player count");
		int playerCount = sc.nextInt();
		Player[] p = new Player[playerCount];
		boolean displayMenu = true;
		for (int i = 0; i < playerCount; i++) {
			System.out.println("Enter the Player Details.");
			String data = sc.next();
			PlayerBO pbo = new PlayerBO();
			p[i] = pbo.createPlayer(data);
		}
		System.out.println("Enter the Team count");
		int teamCount = sc.nextInt();
		Team[] t = new Team[teamCount];
		for(int j=0;j<teamCount;j++){
			System.out.println("Enter the Team Details");
			String data = sc.next();
			TeamBO tbo = new TeamBO();
			t[j] = tbo.createTeam(data, p);
		}
		System.out.println("Enter the Match count.");
		int matchCount = sc.nextInt();
		Match[] m = new Match[matchCount];
		for(int k=0;k<matchCount;k++){
			System.out.println("Enter the Match Details.");
			String data = sc.next();
			MatchBO mbo = new MatchBO();
			m[k] = mbo.createMatch(data, t);
		}
		MatchBO mbo = new MatchBO();
		while (displayMenu) {
			System.out.println("Menu:\n1. Find Team\n2. Find All matches for a Specific Team");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("Enter the match date.");
				String matchDate = sc.next();
				System.out.println("Team");
				System.out.println(mbo.findTeam(matchDate, m));
				break;
			case 2:
				System.out.println("Enter the Team name.");
				String teamName = sc.next();
				System.out.println("Matches");
				mbo.findAllMatchesOfTeam(teamName, m);
				break;
			default:
				System.out.println("Invalid Option! Please select an appropriate option.");
				break;
			}
			System.out.println("Do you want to continue? Type yes/y or no/n");
			String s = sc.next();
			if(s.equalsIgnoreCase("no")|| s.equalsIgnoreCase("n")){
				displayMenu = false;
			}			
		}
	}

}
