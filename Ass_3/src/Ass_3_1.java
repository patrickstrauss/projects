import java.util.Scanner;
public class Ass_3_1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = console.nextLine();
		System.out.println("How old are you?");
		int age = console.nextInt();
		console.nextLine();
		System.out.println("Where are you from?");
		String from = console.nextLine();
		System.out.println("What is your Hobby?");
		String hobby = console.nextLine();
		System.out.println("What is your height?");
		double height = console.nextDouble();
		console.nextLine();
		System.out.println("What is your current GPA?");
		double GPA = console.nextDouble();
		console.nextLine();
		
		System.out.println("My name is " + name);
		System.out.println("I am " + age +  " years old");
		System.out.println("I am from " + from);
		System.out.println("My hobby is " + hobby);
		System.out.println("I am " + height + " cm");
		System.out.println("My current GPA is " + GPA);

	}
}
