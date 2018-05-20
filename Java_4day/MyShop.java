
public class MyShop {

	public static void main(String[] args) {
		Cal cal = new Cal();
		System.out.println(cal.add());
		int a = cal.add();
		System.out.println(a+100);
		System.out.println(cal.minus());
		double b = cal.minus();
		System.out.println(b+11.11);
		String name = cal.getName();
		System.out.println("나의 이름은 : " + name);
	}

}
