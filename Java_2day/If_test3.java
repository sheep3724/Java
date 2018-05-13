import java.util.Scanner;

public class If_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이번달 나의 실적 : ");
		int num = sc.nextInt();
		int company = 1000;
		if(num > company)
		{
			System.out.println("목표달성 성공");
			System.out.println((int)(num * 0.2));
		}
		else
			System.out.println("목표달성 실패");
	}

}
