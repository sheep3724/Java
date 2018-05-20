import java.util.Scanner;

public class Array_test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] subject = new String[3];//갯수
		for (int i = 0; i < subject.length; i++) {
			System.out.print("수강한 과목을 입력하세요 >>> ");			
			subject[i] = sc.next();
		}
		System.out.println(subject[0] + " 보다는 " + subject[2]);
	}
}
