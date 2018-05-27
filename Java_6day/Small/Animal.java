package Small;

public class Animal {
	public int weight;
	
	public void eat() {
		System.out.println("먹다.");
	}

	@Override
	public String toString() {
		return "Animal [weight=" + weight + "]";
	}
	
}
