package class_practice_1;

public class armor {

	public String name;
	public int physical_ar;
	public int magical_ar;

	public armor() {
		name = "non";
		physical_ar = 0;
		magical_ar = 0;
	}

	public armor(String name, int physical_ar, int magical_ar) {
		this.name = name;
		this.physical_ar = physical_ar;
		this.magical_ar = magical_ar;
	}

	public String toString() {
		return "armor name:" + name + "\nphysical armor value:" + physical_ar + "\nmagcial armor value: " + magical_ar;

	}

}
