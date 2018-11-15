
public class Assignment_2_1 {

	public static void main(String[] args) {
		// input values
		double Bibimbub = 120;
		double Kimchi = 30;
		double Subtotal = Bibimbub+Kimchi;
		double Service = 0.1;
		double ServiceCharge = Subtotal*Service;
		double Tax = 0.07;
		double Taxed = Subtotal*Tax;
		// outcome
		System.out.println("Korean Food Receipt");
		System.out.print("Bibimbub: ");
		System.out.println(Bibimbub);
		System.out.print("Kimchi: ");
		System.out.println(Kimchi);
		System.out.print("Subtotal: ");
		System.out.println(Subtotal);
		System.out.println("---------------------");
		System.out.print("Service Charge: 10%: ");
		System.out.println(ServiceCharge);
		System.out.print("Tax 7%: ");
		System.out.println(Taxed);
		System.out.print("Total: ");
		System.out.println(Subtotal+ServiceCharge+Taxed);
		
	}
}
