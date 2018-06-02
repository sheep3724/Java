package collection;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		System.out.println(ski.size());
		System.out.println(ski.get(0));
		System.out.println(ski.get(3));
		ski.remove(1);
		System.out.println(ski);
	}
}
