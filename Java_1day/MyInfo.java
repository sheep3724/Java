import java.util.Scanner;

public class MyInfo {

	public static void main(String[] args) {
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("나이는 : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		System.out.print("학년은 : ");
		int grd = sc.nextInt();
		
		System.out.print("아침은 : ");
		boolean mng = sc.nextBoolean();
		
		System.out.print("시력은 : ");
		float eye = sc.nextFloat();
		
		System.out.print("인생은 : ");
		String fgt = sc.next();
		
		System.out.println("나의 나이는 " + age + "이고,");
		System.out.println("나의 학년는 " + grd + "이고,");
		System.out.println("아침은 " + mng + "이고,");
		System.out.println("나의 시력은 " + eye + "이고,");
		System.out.println("인생은 " + fgt + "이다.");
	}

}
