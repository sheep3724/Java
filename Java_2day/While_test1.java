
public class While_test1 {

	public static void main(String[] args) {
		int x = 1;
		int sum = 0;
		while(x <= 10000) {
			sum = sum + x;
			x++;
		}
		System.out.println(sum);
	}

}
