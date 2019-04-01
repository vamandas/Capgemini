package day4_25march_111010_FS;

public class MatchBO {
	public Match createMatch(String data, Team[] teamList) {
		String[] str = data.split(",");
		String date = str[0];
		String teamone = str[1];
		String teamtwo = str[2];
		String venue = str[3];
		Match match = new Match();
		match.setDate(date);
		match.setVenue(venue);
		for (Team t : teamList) {
			if (teamone.equals(t.getName()))
				match.setTeamone(t);
			if (teamtwo.equals(t.getName()))
				match.setTeamtwo(t);
		}
		return match;
	}

	public String findTeam(String matchDate, Match[] matchList) {
		for (Match m : matchList) {
			if (matchDate.equals(m.getDate()))
				return m.getTeamone().getName() + ", " + m.getTeamtwo().getName();
		}
		return "Sorry! There are no matches on this date.";
	}

	public void findAllMatchesOfTeam(String teamName, Match[] matchList) {
		System.out.println(String.format("%-15s %-15s %-15s %-15s", "Date", "TeamOne", "TeamTwo", "Venue"));
		for (Match m : matchList) {
			if(teamName.equals(m.getTeamone().getName()) || teamName.equals(m.getTeamtwo().getName()))
				System.out.println(m.toString());
		}
	}
}
