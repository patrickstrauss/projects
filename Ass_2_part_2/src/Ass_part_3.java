
public class Ass_part_3 {

	public static void main(String[] args) {
		double Bob [] = new double[5];
		Bob [0] = 3.5;
		Bob [1] = 2.75;
		Bob [2] = 3.21;
		Bob [3] = 3.8;
		Bob [4] = 3.32;
		double Tina [] = {2.5, 2.75, 2.34, 3.09, 3.2, 3.41, 3.21};
		
		double sum_bob = 0;
		double average_bob = 0;
		double sum_tina = 0;
		double average_tina = 0;
		
		for (int i = 0; i<Bob.length; i++) {
		sum_bob += Bob [i];
		}
		average_bob = sum_bob/Bob.length;
		for (int i = 0; i<Tina.length; i++) {
		sum_tina += Tina[i];
		}
		average_tina = sum_tina/Tina.length;
				
				
		System.out.println("Bob's GPAX :" + (average_bob));
		System.out.println("Tina's GPAX :" + (average_tina) );

	}
}
