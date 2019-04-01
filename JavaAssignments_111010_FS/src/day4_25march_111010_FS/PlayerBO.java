package day4_25march_111010_FS;

public class PlayerBO {
	public void viewDetails(Player[] playerList) {
		System.out.println(String.format("%-15s %-15s %-15s", "Player", "Country", "Skill"));
		for (Player p : playerList) {
			System.out.println(p);
		}
	}

	public void printPlayerDetailsWithSkill(Player[] playerList, String skill) {
		boolean hasSkill = false;
		System.out.println(String.format("%-15s %-15s %-15s", "Player", "Country", "Skill"));
		for (Player p : playerList) {
			if (p.getSkill().getSkillName().equals(skill)) {
				hasSkill = true;
				System.out.println(p);
			}
		}
		if (!hasSkill) {
			System.out.println("Skill not found!");
		}
	}

	public Player createPlayer(String data) {
		String[] str = data.split(",");
		String name = str[0];
		String country = str[1];
		String skill = str[2];
		Player p = new Player(name, country, new Skill(skill));
		return p;
	}
}
