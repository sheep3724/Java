
public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.color = "RED";
		myCar.gear = 2;
		myCar.speed = 100;
		System.out.println(myCar.getName("홍길동"));
		int s2 = myCar.nowSpeed(150);
		System.out.println("현재 속도는 " + s2);
		String s = myCar.speedUp();//호출, call.
		myCar.speedDown();
	}

}
