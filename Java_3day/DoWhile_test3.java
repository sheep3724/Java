import java.util.Scanner;

public class DoWhile_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int target = 59;
		int num;
		int count = 0;
		do {
			count++;
			System.out.print("추측한 숫자를 입력하세요. >>> ");
			num = sc.nextInt();	
			
			if(num < target) {
				System.out.println("너무 작습니다.");
			}
			if(num > target) {
				System.out.println("너무 큽니다.");
			}
		} while (num != target);
		System.out.println("숫자 맞추기 성공.!!!");
		System.out.println("당신이 시도한 횟수는 >>> " + count);
	}

}
