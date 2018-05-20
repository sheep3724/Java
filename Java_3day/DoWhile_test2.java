import java.util.Scanner;

public class DoWhile_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num; //전역변수
		do {
			System.out.print("엄마 TV 몇시간 봐도 돼?");
			num = sc.nextInt();//지역변수	
		} while (num != 5);
	}

}
