import java.util.*;
public class Ass_7 {

	public static void main(String[] args) {
		System.out.println("Please put in 5 of your favorite things: ");
		
		outputs(inputs());
	}
	public static String[] inputs() {
		String Arr [] = new String [5];
		Scanner console = new Scanner(System.in);
		String Change = "";
		for(int i = 0; i<Arr.length; i++) {
			System.out.println("Input item " + (i+1) + ": ");
			String inputsF = console.nextLine();
			Arr [i] = inputsF;
			}
		System.out.println("Do you want to change anything? if yes please type in \"yes\"");
		Change = console.next();
		while (Change.equals("yes")){
			System.out.println("Which item would you like to change? ");
			int Cnumber = console.nextInt();
			System.out.println("New input: ");
			String Valuenew = console.next();
			Arr [Cnumber-1] = Valuenew;
			System.out.println("Do you want to change anything? if yes please type in \"yes\"");
			Change = console.next();
		}
		return Arr;
	}
	public static void outputs(String[] Arr) {
		for (int k = 0; k< Arr.length; k++) {
		System.out.println("Favorite thing number" + (k+1) + ": " + Arr [k]);
		}
		}

}
