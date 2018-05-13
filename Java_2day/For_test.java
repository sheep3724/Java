import java.util.Scanner;

public class For_test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int result = 0;
		for(int x = 1 ; x <= y ; x++) {
			result = result + x;
		}
		System.out.println(result);
	}
	

}
