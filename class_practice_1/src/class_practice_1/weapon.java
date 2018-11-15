package class_practice_1;

public class weapon {

	public String name;
	protected int damage;
	public String type_of_weapon;

	public weapon() {
		name = "non";
		damage = 0;
		type_of_weapon = "non";
	}

	public weapon(String name, int damage, String type) {
		this.name = name;
		this.damage = damage;
		this.type_of_weapon = type;
	}

	public String toString() {
		return "Weapon name " + name + "\nDamage " + damage + "\nType " + type_of_weapon;
	}
}
