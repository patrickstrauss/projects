package class_practice_1;

class mage extends character implements travel,defense{
	private String element;

	public mage(int HP, int MP, weapon weapon, armor armor, String element) {
		super(HP, MP, weapon, armor);
		this.element = element;
	}
	public void speed(){
		System.out.println("travel with flying carpet : speed 50");
	}
	public void block_damage() {
		System.out.println("Defend with barrier: block 20 damage");
	}

	public void attack() {
		System.out.println("Attack with " + element + " ball " + "damage = " + char_weapon.damage);
	}

	public String toString() {
		return super.toString() + "\nMage class element: " + element;
	}
}
