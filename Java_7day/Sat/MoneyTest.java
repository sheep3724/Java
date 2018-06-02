package Sat;

public class MoneyTest {

	public static void main(String[] args) {
		Girl g1 = new Girl("홍길동1", 15);
		System.out.println(Girl.dad);
		Girl g2 = new Girl("홍길동2", 10);
		System.out.println(Girl.dad);
		System.out.println(g1);
		System.out.println(g2);
		g1.eat();
		g2.eat();
	}

}
