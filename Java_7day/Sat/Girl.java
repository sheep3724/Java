package Sat;

public class Girl extends Person {
	public String name;
	public int age;
	public static int dad = 10000;
	public Girl(String name, int age) {
		super();
		this.name = name;
		this.age = age;
		dad = dad - 1000; //정적변수
		//정적변수는 클래스당 하나만 존재
		//정적변수는 객체생성하지 않고, 클래스이름 접근 사용
	}
	
	public static int getDad() {
		return dad;
	}
	
	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + "]";
	}
	@Override
	//오버라이딩 : 상속받은 클래스에서 메소드를 재정의해서 사용
	public void eat() {
		System.out.println("치킨을 먹어요");
	}
	
}
