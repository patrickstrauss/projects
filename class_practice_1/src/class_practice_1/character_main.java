package class_practice_1;

public class character_main {

	public static void dotravel(travel c) {c.speed();}
	public static void dodefense(defense c) {c.block_damage();}
	public static void main (String[] args) {

		weapon w1 = new weapon("stone sword", 50, "melee");
		armor a1 = new armor("stone armor", 10, 10);

		mage m1 = new mage(100, 500, w1, a1, "fire");
		swords_men s1 = new swords_men(200, 100, w1, a1, "agility");

		character[] c = new character[3];
		c[0] = new mage(100, 800, w1, a1, "Ice");
		c[1] = new swords_men(500, 100, w1, a1, "Strength");
		c[2] = m1;
		
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			c[i].attack();
			dotravel((travel) c[i]);
			dodefense((defense)c [i]);
			System.out.println();
		}

	}

}
