import java.util.*;
public class Lab_4_2 {
	public static void main(String[] args) {
	Scanner console = new Scanner(System.in);
		System.out.println("Please put in your rating");
		String rating = console.nextLine();
		switch (rating){
		case "1":
			System.out.println("very good");
			break;
		case "2":
			System.out.println("good");
			break;
		case "3":
			System.out.println("normal");
			break;
		case "4":
			System.out.println("bad");
			break;
		case "5":
			System.out.println("very bad");
			break;
		default:
			System.out.println("Invlaid value");
		}
		
	}
}
