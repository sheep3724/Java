package Big;

public class CarTest {
	public static void main(String[] args) {
		CoffeTruck coffe = new CoffeTruck();
		coffe.color = "파랑";
		coffe.count = 2;
		coffe.size = 1;
		
		coffe.load();
		coffe.sell();
		coffe.speedUp();
	}
}
