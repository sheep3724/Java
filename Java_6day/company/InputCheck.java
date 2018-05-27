package company;

import java.util.Scanner;

public class InputCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일을 입력하세요  >>> ");
		String input = sc.next();
		System.out.println("입력한 글자수는 : " + input.length());
		System.out.println("sheep3724로 시작하는 id인가요? " + input.startsWith("sheep3724"));
		System.out.println("com으로 끝나나요? " + input.endsWith("com"));
		if(input.startsWith("admin")) {
			System.out.println("관리자가 로그인했습니다.");			
		}
		else
			System.out.println("사용자 계정으로 로그인했습니다.");
	}
}
