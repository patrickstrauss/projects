import java.util.*;

public class Ass_1_part_4 {

	public static void main(String[] args) {

		find_odd(1, 5);
		find_odd(5, 10);
		runchar('*', 5);
		runchar('^', 3);

	}

	public static void find_odd(int a, int b) {
		for (int i = a; i <= b; i += 2) {
			System.out.print(i);
			if (i < b - 1) {
				System.out.print(",");
			}
		}
		System.out.println();

	}

	public static void runchar(char a, int b) {
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println();

	}

}
