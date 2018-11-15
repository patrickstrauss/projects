import java.io.ObjectInputFilter.Status;
import java.sql.Time;

public class alarm_main {

	public static void main(String[] args) {
		alarm_c a1 = new alarm_c();
		alarm_c a2 = new alarm_c(false, "7am","no alarm set");
		alarm_c a3 = new alarm_c();
		
		System.out.println(a1);
		System.out.println();
		System.out.println(a2);
		

	}

}
