package File;

public class ErrorTest {
	public static void main(String[] args) {
		int[] num = new int[2];
		try {
			System.out.println(num[2]);
		} catch (Exception e) {//예외
			System.out.println("에러가 발생했는데, 내가 처리했어요");
		}
		System.out.println("내가 실행될까요...");
		
	}
}
