import java.util.*;
public class Lab_4_1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your grade");
		double grade = console.nextDouble();
		console.nextLine();
		if (grade>=90 && grade<=100) {
			System.out.println("grade is equal to " + 'A');
		}
		else if (grade>=80 && grade<=100) {
			System.out.println("grade is equal to " + 'B');
		}
		else if (grade>=70 && grade<=100) {
			System.out.println("grade is equal to " + 'C');
		}
		else if (grade>=60 && grade<=100) {
			System.out.println("grade is equal to " + 'D');
		}
		else if (grade<60 && grade>=0) {
			System.out.println("grade is equal to " + 'F');
		}
		else {
			System.out.println("Invalid value");
		}

	}

}
