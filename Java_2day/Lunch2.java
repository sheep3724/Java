import java.util.Scanner;

public class Lunch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("짜장면 가격 : ");
		int prc1 = sc.nextInt();
		System.out.print("짬뽕 가격 : ");
		int prc2 = sc.nextInt();
		System.out.print("짜장면 주문수 : ");
		int num1 = sc.nextInt();
		System.out.print("짬뽕 주문수 : ");
		int num2 = sc.nextInt();
		int result = (prc1*num1) + (prc2*num2);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("전체 주문 금액 : " + result);
	}

}
