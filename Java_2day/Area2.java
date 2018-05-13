import java.util.Scanner;

public class Area2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 가로를 입력하세요. >>> ");
		int wth = sc.nextInt();
		System.out.println("사각형의 세로를 입력하세요. >>> ");
		int hgt = sc.nextInt();
		System.out.print("사각형의 면적은 ==>" + wth*hgt);
	}

}
