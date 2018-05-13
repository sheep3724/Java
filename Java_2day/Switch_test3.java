import java.util.Scanner;

public class Switch_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("엄마가 주신 용돈 금액 >>> ");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("엄마 감사합니다.");
			break;
		case 2:
			System.out.println("엄마 진심으로 감사드립니다.");
			break;
		case 3:
			System.out.println("앗싸! 복받으실 거에요.");
			break;
		default:
			System.out.println("엄마 용돈주세요.");
			break;
		}
	}

}
