package Big;

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.weight = 100;
		dog.owner = "나";
		dog.eat();
		dog.bark();
		Cat cat = new Cat();
		cat.weight = 50; 
		cat.sleep();
	}
}
