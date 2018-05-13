import java.util.Scanner;

public class Switch_test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String food = sc.next();
		switch(food) {
		case "분식" :
			System.out.println("분식집으로");
			break;
		case "한식" :
			System.out.println("한식집으로");
			break;
		case "일식" : 
			System.out.println("일식집으로");
			break;
		default:
			System.out.println("안먹어요");
			break;
		}
	}

}
