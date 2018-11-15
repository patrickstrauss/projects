import java.util.*;

public class Ass_1_part_2 {

	public static void main(String[] args) {
		String mon = "Monday";
		String tue = "Tuesday";
		String wed = "Wednesday";
		String thu = "Thursday";
		String fri = "Friday";
		String sat = "Saturday";
		String sun = "Sunday";

		String ex = "run";

		Scanner console = new Scanner(System.in);

		System.out.println("Type in \"run\" to execute the program");
		ex = console.next();
		while (ex.equalsIgnoreCase("run")) {
			System.out.println("Input date");
			String input = console.next();

			if (input.equals("1")) {
				System.out.println(mon);
			} else if (input.equals("2")) {
				System.out.println(tue);
			} else if (input.equals("3")) {
				System.out.println(wed);
			} else if (input.equals("4")) {
				System.out.println(thu);
			} else if (input.equals("5")) {
				System.out.println(fri);
			} else if (input.equals("6")) {
				System.out.println(sat);
			} else if (input.equals("7")) {
				System.out.println(sun);
			} else {
				System.out.println("Invalid");
			}
			System.out.println();
			System.out.println();
			System.out.println("Type in \"run\" to execute the program");
			ex = console.next();
		}

	}

}
