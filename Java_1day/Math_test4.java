import java.util.Scanner;

public class Math_test4 {

	public static void main(String[] args) {
		//키보드로 입력한 것 자바코드로 가지고 들어오는
		//기능을 가진 부품(클래스)가 필요
		//복사해서 쓸 예정
		Scanner sc = new Scanner(System.in);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.print("숫자 1입력 : ");
		int x = sc.nextInt();
		System.out.print("숫자 2입력 : ");
		int y = sc.nextInt();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("첫 번째 입력값 : " + x);
		System.out.println("두 번째 입력값 : " + y);
	}

}
