import java.util.Scanner;

public class Area1 {

	public static void main(String[] args) {
		System.out.print("반지름을 입력하세요. >>> ");
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		int r = sc.nextInt();
		double result = r*r *pi;
		System.out.print("원의 면적은 ==>" + result);
		if(result > 50)
			System.out.println("50을 넘습니다.");
		else
			System.out.println("50을 넘지 않습니다");
	}

}
