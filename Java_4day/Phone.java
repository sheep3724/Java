
public class Phone {//부품 => 클래스로
//	-동적 : 전화하다, 음악을 듣다, 게임하다
//	=>메소드
	void call() {
		System.out.println("전화하다.");
	}
	void music() {
		System.out.println("음악을 듣다.");
	}
	void game() {
		System.out.println("게임을 하다.");
	}
//	-정적 : 소리버튼, 화단, 화면크기, 케이스
//	=>변수
	int soundButton;
	int size;
	String color;
}
