
public class Array_test1 {
	public static void main(String[] args) {
		int[] num = new int[100];
		for(int i = 0; i< num.length; i++)
		{
			num[i] = i;
			System.out.println(num[i]);
		}
		int[] num2 = {10,20,30};
		System.out.println(num2.length);
		for (int i = 0; i < num2.length; i++) {
			System.out.println(num2[i]);
		}
	}
}
