import java.util.*;

public class Ass_1_part_2_2 {

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
			switch (input) {
			case "1":
				System.out.println(mon);
				break;
			case "2":
				System.out.println(tue);
				break;
			case "3":
				System.out.println(wed);
				break;
			case "4":
				System.out.println(thu);
				break;
			case "5":
				System.out.println(fri);
				break;
			case "6":
				System.out.println(sat);
				break;
			case "7":
				System.out.println(sun);
				break;

			default:
				System.out.println("Invalid input");
			}
			System.out.println();
			System.out.println();
			System.out.println("Type in \"run\" to execute the program");
			ex = console.next();
		}

	}

}
