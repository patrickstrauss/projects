
public class map_area {

	public static void main(String[] args) {
		maps a1 = new maps();
		maps a2 = new maps("dark swamp", "a dark swampy forest filled with nasty monsters", "south of human village",
				"slime, mud golem, anaconda", 5);

	
		System.out.println(a1);
		a1.danger_lvl(a1.difficulty);
		System.out.println(a1.danger_lvl);
		System.out.println();
		System.out.println();
		System.out.println(a2);
		a2.danger_lvl(a2.difficulty);
		System.out.println(a2.danger_lvl(a2.difficulty));
	}

}
