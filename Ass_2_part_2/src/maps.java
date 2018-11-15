
public class maps {

	public String area;
	public String description;
	public String direction;
	public String monster;
	public int difficulty;
	//  variable for the method
	public String danger_lvl;

	public maps() {
		area = "human village";
		description = "A human village where you can buy, craft, sell tiems, and receive quests";
		direction = "North of the dark swamp";
		monster = "no monster";
		difficulty = 0;
	}

	public maps(String area, String description, String direction, String monster, int difficulty) {
		this.area = area;
		this.description = description;
		this.direction = direction;
		this.monster = monster;
		this.difficulty = difficulty;
	}

	public String getarea(String area) {
		return area;
	}
	public String getdescription(String description) {
		return description;
	}
	public String direction(String direction) {
		return direction;
	}
	public String monster(String monster) {
		return monster;
	}
	public int difficulty(int difficulty) {
		return difficulty;
	}
	public void setarea(String area) {
		this.area = area;
	}
	public void setdescription(String description) {
		this.description = description;
	}
	public void setdirection(String direction) {
		this.direction = direction;
	}
	public void setmonster(String monster) {
		this.monster = monster;
	}
	public void setdifficulty(int difficulty) {
		this.difficulty = difficulty;
	}
	
	public String danger_lvl(int difficulty) {
		if (difficulty >= 10) {
			danger_lvl = "High";
		}
		else if(difficulty >= 5) {
			danger_lvl = "Medium";
		}
		else{
			danger_lvl = "Low";
		}
		return danger_lvl;
	}
	

	public String toString() {
		return area + "\n" + description + "\n" + direction + "\n" + monster + "\n" + "level " + difficulty + " area";
	}
}
