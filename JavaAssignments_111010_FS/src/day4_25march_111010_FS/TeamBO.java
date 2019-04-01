package day4_25march_111010_FS;

public class TeamBO {
	public Team createTeam(String data, Player[] PlayerList) {
		String[] str = data.split(",");
		String name = str[0];
		String player = str[1];
		Team team = new Team();
		for (Player p : PlayerList) {
			if (player.equals(p.getName())) {
				team.setName(name);
				team.setPlayer(p);
				return team;
			}
		}
		System.out.println("Cannot find Player.");
		return team;
	}
}
