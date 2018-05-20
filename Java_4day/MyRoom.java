
public class MyRoom {

	public static void main(String[] args) {
		Phone p = new Phone();
		p.color = "실버";
		p.size = 7;
		p.soundButton = 1;
		p.game();//메소드를 쓰는 것.(호출, call)
		p.music();
		p.call();
		System.out.println(p.color);
		
		Dog d = new Dog();
		d.neckLength = 7;
		d.size = 10;
		d.tailLength = 7;
		d.bark();
		d.smell();
		d.tail();
	}

}
