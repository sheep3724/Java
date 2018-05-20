import java.util.Scanner;

public class DoWhile_test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int food;
		do {
			System.out.println("[점심메뉴 : 1-짜장, 2-짬뽕, 3-우동]");			
			food = sc.nextInt();
			if(food == 1)
				System.out.println("짜장먹자");
			else if(food == 2)
				System.out.println("짬뽕먹자");
			else if(food == 3)
				System.out.println("우동먹자");
		} while ((food < 1)||(food > 3));
	}

}
