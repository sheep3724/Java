import java.util.Scanner;

public class Array_test11 {
	public static void main(String[] args) {
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------------------------");
			
			for(int i = 0; i < seat.length; i++)
			{
				System.out.print(i+1 + "   ");
			}
			System.out.println();
			System.out.println("----------------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "   ");
			}
			System.out.println();
			System.out.print("예메를 원하는 좌석번호를 입력하세요. (종료: -1)");
			int input = sc.nextInt();
			if(input == -1) {
				break;
			}
			if(seat[input-1] == 0)
			{
				seat[input-1] = 1;//예약
				System.out.println("예약이 완료되었습니다.");
			}
			else{
				System.out.println("이미 예약이 완료된 자리입니다.");
			}
		}

	}
}
