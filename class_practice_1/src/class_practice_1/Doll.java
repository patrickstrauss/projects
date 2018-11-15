package class_practice_1;

abstract class Doll {

	public int size, weight, height;
	public String species;
	public double price;

	public Doll(int size, int weight, int height, String species, double price) {
		this.size = size;
		this.weight = weight;
		this.height = height;
		this.species = species;
		this.price = price;
	}

	public int getsize() {
		return this.size;
	}

	public int getweight() {
		return this.weight;
	}

	public int getheight() {
		return this.height;
	}

	public String getspecies() {
		return this.species;
	}

	public double getprice() {
		return this.price;
	}

	public void setsize(int size) {
		this.size = size;
	}

	public void setweight(int weight) {
		this.weight = weight;
	}

	public void setheight(int height) {
		this.height = height;
	}

	public void setspecies(String species) {
		this.species = species;
	}

	public void setprice(double price) {
		this.price = price;
	}
	
	abstract void talk();
	abstract void walk();

	public String toString() {
		return "\nsize: " + size + "\nweight: " + weight + "\nheight: " + height + "\nspecies: " + species + "\nprice: "
				+ price;
	}
}
