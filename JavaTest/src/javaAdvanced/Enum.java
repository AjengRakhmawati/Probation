package javaAdvanced;
import java.util.Scanner;
enum Days{
	SUNDAY, MONDAY,TUESDAY, WEDNESDAY, THURSTDAY, FRIDAY, SATURDAY;
}


public class Enum {
	
	Days day;
	
	public Enum(Days day) {
		this.day = day;
		
	}
	public void dayIsLike() {
		
		switch (day) {
		case MONDAY:
			System.out.println("MONDAYS are MONSTER DAY");
			break;
		case FRIDAY:
			System.out.println("FRIDAYs are BEST DAY");
			break;
		case SATURDAY:
			System.out.println("another BEST DAY");
			break;
		case SUNDAY:
			System.out.println("always deg deg an euy");
			break;

		default:
			System.out.println("weekdays are soso");
			break;
		}
	}
	
	public static void main(String[] args) {
//		Scanner a = new Scanner(System.in);
//		System.out.println("What day is today : ");
//		String dname = a.nextLine().toUpperCase();
		String d_day = "FRIDAY";
		Enum t1 = new Enum(Days.valueOf(d_day));
		t1.dayIsLike();
	}

}
