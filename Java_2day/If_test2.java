import java.util.Scanner;

public class If_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> : ");
		int num = sc.nextInt();
		if(num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

	}

}
