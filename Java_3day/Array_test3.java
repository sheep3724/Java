import java.util.Scanner;

public class Array_test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾고자 하는 숫자를 입력하세요.");
		int num = sc.nextInt();
		int[] s = {11, 55, 77, 22, 99};
		for (int i = 0; i < s.length; i++) {
			if(s[i] == num) {
				System.out.println((i+1) + "번째 위치에 있습니다.");
			}
		}
	}
}
