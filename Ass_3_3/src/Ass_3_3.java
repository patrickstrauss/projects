import java.util.*;
public class Ass_3_3 {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
		 	//input 1
	        System.out.print("Enter first product name: ");
	        String product1 = console.nextLine();
	        //input 2
	        System.out.print("Enter first product price: ");
	        Double price1 = console.nextDouble();
	        console.nextLine();
	        //input 3
	        System.out.print("Enter second product name: ");
	        String product2 = console.nextLine();
	        //input 4
	        System.out.print("Enter second product price: ");
	        Double price2 = console.nextDouble();
	        console.nextLine();
	        //break line
	        System.out.println("----------------------");
	        //input 5
	        System.out.println("Enter cash: ");
	        Double cash = console.nextDouble();
	        //operation
	        double totalprice = (price1 + price2);
	        if (totalprice < cash) {
	            System.out.println("Change: " + (cash-totalprice));
	        }
	        else if 
	            (totalprice > cash) 
	        System.out.println("Not enough cash!");

	        else {
	            System.out.println("No change.");
	        }


	}

}
