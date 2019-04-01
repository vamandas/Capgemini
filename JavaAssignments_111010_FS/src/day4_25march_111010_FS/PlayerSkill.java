package day4_25march_111010_FS;

import java.util.Scanner;

public class PlayerSkill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of players");
		int n = sc.nextInt();
		Player[] p = new Player[n];
		boolean displayMenu = true;
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the Player Details.");
			System.out.println("Enter player name");
			String name = sc.next();
			System.out.println("Enter country name");
			String country = sc.next();
			System.out.println("Enter skill");
			String skill = sc.next();
			Player player = new Player(name, country, new Skill(skill));
			p[i] = player;
		}
		PlayerBO pbo = new PlayerBO();
		while (displayMenu) {
			System.out.println("Menu:\n1. View details\n2. Filter players with skill\n3. Exit");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				pbo.viewDetails(p);
				break;
			case 2:
				System.out.println("Enter Skill");
				pbo.printPlayerDetailsWithSkill(p, sc.next());
				break;
			case 3:
				displayMenu = false;
				break;
			default:
				System.out.println("Invalid Option! Please select an appropriate option.");
				break;
			}
		}
	}
}