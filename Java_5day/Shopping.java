
public class Shopping {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "김기자";
		m1.age = 20;
		m1.tel = "011-245-111";
		m1.add = "종로";
		System.out.println(
				m1.name + ", " + m1.tel
				);
		Member m2 = new Member();
		//m2가 내가 프로그램하려고 했던 대상
		//m2는 객체(object)
		//new키워드는 객체를 만들 때 사용
		
		m2.name = "박기자";
		m2.age = 50;
		m2.tel = "019-145-7896";
		m2.add = "영등포";
		System.out.println(
				m2.name + ", " + m2.tel
				);
	}

}
