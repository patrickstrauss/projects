
public class test_game {

	public static void main(String[] args) {
		Character c1 = new Character(100,100);
		int curHP = c1.getHP();
		int curMP = c1.getMP();
		System.out.println(curHP);
		System.out.println(curMP);
		c1.deHP(10);
		System.out.println(c1);
	}

}
