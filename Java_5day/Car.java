
public class Car {
	int speed;
	int gear;
	String color;
	String getName(String name){
		return "당신의 이름은 " + name + " 이군요";
	}
	int nowSpeed(int s) {
		return s;
	}
	String speedUp(){
		return "스피드를 UP했습니다."; 
	}
	void speedDown() {
		System.out.println("스피드 다운");
	}
}
