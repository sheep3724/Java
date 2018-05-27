package company;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person(100, 200, "졸림");
		Person p2 = new Person(200, 200, "깸", "종로구");
		System.out.println("p1의 몸무게 : " + p1.getWeight());
		System.out.println("p2의 비밀 : " + p1.getSecret());
	}
}
