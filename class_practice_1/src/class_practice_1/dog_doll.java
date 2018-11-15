package class_practice_1;

public class dog_doll extends Doll{

	public dog_doll(int size, int weight, int height, String species, double price) {
		super(size, weight, height, species, price);
		
	}

	@Override
	void talk() {
		System.out.println("bark");
		
	}

	@Override
	void walk() {
		System.out.println(10);
		
	}

}
