
public class Array_test1 {

	public static void main(String[] args) {
		int[] num = {66, 77, 88, 99};
		int[] copy = new int[4];
		int a = num.length-1;
		for (int i = 0; i < num.length; i++) {
			copy[i] = num[a];
			--a;
			System.out.print(copy[i] + " ");
		}
	
	}

}
