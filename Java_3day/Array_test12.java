import java.util.Arrays;
import java.util.Scanner;

public class Array_test12 {
	public static void main(String[] args) {
		int[] num = {1, 5, 2, 9};
		int[] copy = num;
		num[0] = 8;
		System.out.println(copy[0]);
		
		int[] copy2 = num.clone();
		num[0] = 7;
		System.out.println(copy2[0]);
		
		Arrays.sort(copy2);
		for(int i : copy2) {
			System.out.print(i + "");
		}
	}
}
