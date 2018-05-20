import java.util.Scanner;

public class Array_test8 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int avg = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < scores.length; i++) {
			System.out.print("성적을 입력하시오 : ");
			scores[i] = sc.nextInt();
			avg = avg + scores[i];
			}
			System.out.println((float)avg/scores.length);
		}
	}
