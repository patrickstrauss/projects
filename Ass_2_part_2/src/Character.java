
public class Character {

	public int HP,MP;
	
	public Character() {
		HP = 10;
		MP = 10;
	}
	public Character(int h, int m) {
		HP = h;
		MP = m;
	}

	public void heal(int HP) {
	}

	public void attack(int speed) {

	}
	public String toString() {
		return"HP is " + HP + "\nMP is " + MP;
	}
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
		this.MP= MP;
	}
	public void deHP(int minusHP) {
		System.out.println("You got damaged by " + minusHP);
		setHP(getHP()-minusHP);
	}

}
