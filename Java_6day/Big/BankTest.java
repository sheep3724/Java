package Big;

public class BankTest {
	public static void main(String[] args) {
		BadBank bad = new BadBank();
		System.out.println("나쁜 은행의 이자율은 " + bad.getInterestRate());
		NormalBank nor = new NormalBank();
		System.out.println("나쁜 은행의 이자율은 " + nor.getInterestRate());
		GoodBank good = new GoodBank();
		System.out.println("나쁜 은행의 이자율은 " + good.getInterestRate());
	}
}
