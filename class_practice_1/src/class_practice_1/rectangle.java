package class_practice_1;

public class rectangle {
	public int width;
	public int height;
	private point  coordinate;

	public rectangle() {
		width = 0;
		height = 0;
		coordinate = new point(0,0);
	}
	public rectangle(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.coordinate = new point(x,y);
	}
	void showlocation() {
		System.out.println(coordinate);
	}
	public String toString() {
		return "This is a point" + "\n" + coordinate.x + "\n"+ coordinate.y;
	}

}
