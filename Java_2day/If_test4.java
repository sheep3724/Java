import java.util.Scanner;

public class If_test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> : ");
		int num1 = sc.nextInt();
		System.out.print("숫자를 입력하세요 >> : ");
		int num2 = sc.nextInt();
		if(num1 > num2)
			System.out.println(num1 + "이 더 큽니다");
		else
			System.out.println(num2 + "이 더 큽니다");
	}

}
