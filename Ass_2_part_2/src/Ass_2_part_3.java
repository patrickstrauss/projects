
public class Ass_2_part_3 {

	public static void main(String[] args) {
		
		String[] multispell = Attack("Fireball", 5);
		
		for(int i=0; i<multispell.length; i++) {
		System.out.println(multispell [i]);
		}
		
	}
	public static String [] Attack(String a, int b){
		String [] multispell = new String[b];
		for(int i =0; i<b; i++) {
		multispell [i] = "Cast" + a;
		}
		return multispell;
	}

}
