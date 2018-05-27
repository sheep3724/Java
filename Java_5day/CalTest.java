import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalUpgrade cal = new CalUpgrade();
		System.out.println(cal.add("안", "녕"));
		System.out.println(cal.add(11.11, 55.55));
		System.out.println(cal.add(55, 11.11));
		System.out.println(cal.add(11, 55));
		int x = sc.nextInt();
		int y = sc.nextInt();
		int result = cal.add(x, y);
		System.out.println("두 수를 더한 값은 " + result);
		result = cal.minus(x, y);
		System.out.println("두 수를 뺀 값은 " + result);
	}

}
