
public class Dog {
// 강아지 => 클래스 : Dog
//		-정적 : 목줄, 꼬리, 사이즈 => 변수
	int neckLength;
	int tailLength;
	int size;
//		-동적 : 짖다, 꼬리를 흔들다. 냄새를 맡다.
//			=>메소드
	void bark() {
		System.out.println("짖다.");
	}
	void tail() {
		System.out.println("꼬리를 흔들다.");
	}
	void smell() {
		System.out.println("냄새를 맡다.");
	}
}
