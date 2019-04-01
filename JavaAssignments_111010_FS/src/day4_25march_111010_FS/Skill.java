package day4_25march_111010_FS;

public class Skill {
	private String skillName;

	public Skill(String skillName) {
		super();
		this.skillName = skillName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String toString() {
		return String.format("%-15s", skillName);
	}
}
