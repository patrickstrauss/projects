
public class Ass_2_part_2 {

	public static void main(String[] args) {
		String attack_string = Attack("slash", "head");
		System.out.println("Attack with " + attack_string);
		String attack2_string = Attack("bow", "eye");
		System.out.println("Attack with " + attack2_string);

	}

	public static String Attack(String a, String b) {
		return a + " in the " + b;
	}

}
