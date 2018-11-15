package class_practice_1;

public class robot_doll extends Doll implements AI{

	public robot_doll(int size, int weight, int height, String species, double price) {
		super(size, weight, height, species, price);
		
	}

	@Override
	void talk() {
		System.out.println("I am robot");
		
	}

	@Override
	void walk() {
		System.out.println(8);
		
	}

	@Override
	public void talkback() {
	System.out.println("I am a human being");
		
	}

}
