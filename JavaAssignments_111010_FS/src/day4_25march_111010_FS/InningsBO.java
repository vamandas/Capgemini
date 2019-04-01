package day4_25march_111010_FS;

public class InningsBO {
	Innings createInnings(String data) {
		String[] str = data.split(",");
		Long inningsNumber = Long.parseLong(str[0]);
		String battingTeam = str[1];
		Innings innings = new Innings(inningsNumber,battingTeam);
		return innings;
	}
}