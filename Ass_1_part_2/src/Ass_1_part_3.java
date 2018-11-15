import java.util.*;

public class Ass_1_part_3 {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		int odd = 0;
		int even = 0;
		String ex = "run";

		System.out.println("Type in \"run\" to execute the program");
		ex = console.next();
		while (ex.equalsIgnoreCase("run")) {

			System.out.println("Please put in number");
			int input = console.nextInt();
			console.nextLine();
			System.out.print("Odd :");
			for (int i = 1; i <= input; i += 2) {
				System.out.print(i);
				if(i<input-1) {
					System.out.print( ",");
					}
				odd++;
			}

			System.out.println();

			System.out.print("Even :");
			for (int i = 2; i <= input; i += 2) {
				System.out.print(i);
				if(i<input-1) {
				System.out.print( ",");
				}
				even++;
			}
			System.out.println();
			System.out.println("Odd count :" + odd);
			System.out.print("Even count :" + even);
			System.out.println();
			System.out.println();
			System.out.println("Type in \"run\" to execute the program");
			ex = console.next();
		}
	}
}
