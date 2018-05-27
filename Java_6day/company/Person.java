package company;

public class Person {
		int height, weight;
		String secret, address;
		
		
	public Person(int height, int weight, String secret) {
			super();
			this.height = height;
			this.weight = weight;
			this.secret = secret;
		}
	public Person(int height, int weight, String secret, String address) {
		super();
		this.height = height;
		this.weight = weight;
		this.secret = secret;
		this.address = address;
	}
	public int getWeight() {
		return weight;
	}
	public String getSecret() {
		return secret;
	}
}
