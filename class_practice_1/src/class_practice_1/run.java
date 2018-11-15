package class_practice_1;

public class run {

	public static void dotalk(AI r) {r.talkback();}
	public static void main(String[] args) {
		Doll c = new cat_doll(5,5,5,"Cat", 5.0);
		Doll d = new dog_doll(5,5,5,"dog",8.0);
		Doll r = new robot_doll(5,5,5,"robot",10.0);
		Doll [] doll_list = {c,d};
		doll_shop shop = new doll_shop("name","stamford",5,doll_list);

		
		
		System.out.println(d);
		c.talk();
		d.talk();
		r.talk();
		System.out.println(shop);
		
		

	}

}
