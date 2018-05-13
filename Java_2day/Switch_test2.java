import java.util.Scanner;

public class Switch_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 알고 싶은 월을 입력하세요. >>> ");
		int num = sc.nextInt();
		switch(num) {
		case 3: case 4: case 5:
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
	}

}