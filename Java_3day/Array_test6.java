import java.util.Scanner;

public class Array_test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1 : 숫자를 입력하세요. >>> ");
		int[] input = new int[3];
		input[0] = sc.nextInt();
		System.out.print("2 : 숫자를 입력하세요. >>> ");
		input[1] = sc.nextInt();
		System.out.println(input[0]+input[1]);
	}
}
