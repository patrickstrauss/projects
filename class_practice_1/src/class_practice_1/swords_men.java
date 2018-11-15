package class_practice_1;

class swords_men extends character implements travel, defense {

	public String type;

	public swords_men(int HP, int MP, weapon weapon, armor armor, String type) {
		super(HP, MP, weapon, armor);
		this.type = type;
	}
	public void speed(){
		System.out.println("travel with pegasus : speed 40");
	}
	public void block_damage() {
		System.out.println("Defend with shiled: block 30 damage");
	}

	public void attack() {
		if (type.equalsIgnoreCase("agility")) {
			System.out.println("High speed slash" + " dealing: " + char_weapon.damage + " damage");
		} else {
			System.out.println("Powerful slash" + " dealing:" + char_weapon.damage + " damage");
		}
	}

	public String toString() {
		return super.toString() + "\nswordsmen class: " + type;
	}

}
