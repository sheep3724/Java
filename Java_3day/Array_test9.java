import java.util.Scanner;

public class Array_test9 {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			System.out.print((i+1)+ "번째 성적을 입력하세요 >>> ");
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		System.out.println("평균 성적은 : " + sum/a.length);
				
	}
}
