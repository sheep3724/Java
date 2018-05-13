import java.util.Random;

public class Random_test1 {

	public static void main(String[] args) {
		Random random = new Random(200);
		for (int i = 0; i < 7; i++) {
			int num = random.nextInt(46);
			System.out.println(num);
		}
	}

}
