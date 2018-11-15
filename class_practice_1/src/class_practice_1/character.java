package class_practice_1;

abstract class character {

	protected int HP, MP;
	protected weapon char_weapon;
	protected mage class_c;
	protected armor armor_c;

	public character() {
		HP = 100;
		MP = 100;
		char_weapon = new weapon();
		armor_c = new armor();
	}

	public character(int h, int m, weapon weapon, armor armor_c) {
		HP = h;
		MP = m;
		this.char_weapon = weapon;
		this.armor_c = armor_c;
	}

	public void heal(int HP) {
	}

	abstract public void attack();

	public int getHP() {
		return this.HP;
	}

	public int getMP() {
		return this.MP;
	}

	public void setHP(int HP) {
		this.HP = HP;
	}

	public void setMP(int MP) {
		this.MP = MP;
	}

	public void deHP(int minusHP) {
		System.out.println("You got damaged by " + minusHP);
		setHP(getHP() - minusHP);
	}

	public String toString() {
		return "Current HP " + HP + "\nCurrent MP " + MP + "\nWeapon name: " + char_weapon.name + "\nWeapon damage: "
				+ char_weapon.damage + "\nWeapon type: " + char_weapon.type_of_weapon + "\nArmor name: " + armor_c.name
				+ "\nPhysical armor value: " + armor_c.physical_ar + "\nMagical armor value: " + armor_c.magical_ar;
	}
}
