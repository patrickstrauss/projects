package class_practice_1;

public class cat_doll extends Doll{
	public cat_doll(int size, int weight, int height, String species, double price) {
		super(size, weight, height, species, price);
		
	}

	@Override
	void talk() {
		System.out.println("Meow");
		
	}

	@Override
	void walk() {
		System.out.println(8);
		
	}

}
