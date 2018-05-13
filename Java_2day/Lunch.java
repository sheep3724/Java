import java.util.Scanner;

public class Lunch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점심으로 먹고 싶은 음식을 고르세요.");
		System.out.println("1.짜장면 | 2.짬뽕 | 3.우동 | 4.안먹어요");
		int chs = sc.nextInt();
		switch(chs) {
		case 1:
			System.out.println("짜장면을 고르셨군요. 맛있게 드세요.");
			break;
		case 2:
			System.out.println("짬뽕을 고르셨군요. 맛있게 드세요.");
			break;
		case 3:
			System.out.println("우동을 고르셨군요. 맛있게 드세요.");
			break;
		case 4:
			System.out.println("안먹는다고요... 배가 고프시겠군요.!");
			break;
		}

	}

}
