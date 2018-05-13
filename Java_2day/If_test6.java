import java.util.*;

public class If_test6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grd = sc.nextInt();
		if(grd >= 90)
			System.out.println("A");
		else if(grd >= 80)
			System.out.println("B");
		else if(grd >= 70)
			System.out.println("C");
		else if(grd >= 60)
			System.out.println("D");
		else
			System.out.println("F");
			
		}
	}

