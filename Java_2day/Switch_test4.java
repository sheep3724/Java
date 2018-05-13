import java.util.Scanner;

public class Switch_test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("일수를 알고 싶은 월을 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
		case 2:
			System.out.println("월의 날수는 : 28");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("월의 날수는 : 30");
			break;
		default:
			System.out.println("월의 날수는 : 31");
			break;
		}
	}

}
