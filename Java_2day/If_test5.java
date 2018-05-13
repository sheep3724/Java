import java.util.*;

public class If_test5 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		if(hour < 11) {
			System.out.println("굿모닝");
		}else if(hour < 3) {
			System.out.println("굿 에프터눈");
		}else if(hour < 20) {
			System.out.println("굿 이브닝");
		}else {
			System.out.println("굿 나잇");
		}
//		System.out.println(date.getHours());
//		System.out.println(date.getMinutes());
//		System.out.println(date.getSeconds());
	}

}
