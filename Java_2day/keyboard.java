import java.util.Scanner;

public class keyboard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키보드 가격 : ");
		int kprc = sc.nextInt();
		System.out.print("키보드 갯수 : ");
		int knum = sc.nextInt();
		System.out.print("마우스 가격 : ");
		int mprc = sc.nextInt();
		System.out.print("마우스 갯수 : ");
		int mnum = sc.nextInt();
		int ktotal = kprc*knum;
		int mtotal = mprc*mnum;
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("키보드 총 가격 : " + ktotal);
		System.out.println("마우스 총 가격 : " + mtotal);
		System.out.println("제품 총 가격 : " + (ktotal+mtotal));
	}

}
