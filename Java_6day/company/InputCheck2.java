package company;

import java.util.Scanner;

public class InputCheck2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("좋아하는 과목을 순서대로 입력하세요 : ");
		String input = sc.next();
		String[] s = input.split(":");
		System.out.println("당신이 제일 좋아하는 과목은 " + s[0] + "이군요");
		System.out.println("당신이 2번째로 좋아하는 과목은 " + s[1] + "이군요");
		System.out.println("당신이 3번째로 좋아하는 과목은 " + s[2] + "이군요");
	}
}
