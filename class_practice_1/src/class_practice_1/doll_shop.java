package class_practice_1;

public class doll_shop {

	public String name, location;
	public int total_quantity;
	public Doll doll_list[];

	public doll_shop(String name, String Location, int total_quantity, Doll [] doll_list) {
		this.name = name;
		this.location = location;
		this.total_quantity = total_quantity;
		this.doll_list = doll_list;
	}

	public String getname() {
		return this.name;
	}

	public String getlocation() {
		return this.location;
	}

	public int gettotal_quantity() {
		return this.total_quantity;
	}

	public Doll[] getdoll_list() {
		return this.doll_list;
	}

	public void setname(String name) {
		this.name = name;
	}

	public void setlocation(String location) {
		this.location = location;
	}

	public void settotal_quantity(int total_quantity) {
		this.total_quantity = total_quantity;
	}

	public void setdoll_list(Doll[] doll_list) {
		this.doll_list = doll_list;
	}

	public void seedoll_list() {
		for (int i = 0; i < doll_list.length; i++) {
			System.out.println(doll_list[i]);
		}
	}

	public String toString() {
		String toreturn = "";
		for (int i = 0; i < doll_list.length; i++) {
			toreturn += doll_list[i];
		}
		
		return "shop name: " + name + "\nlocation: " + location + "\ntotal_quantity" + total_quantity + "\n\ndoll list: "
				+ toreturn;
	}
}
