package collection;

import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		HashMap phone = new HashMap();
		phone.put(1, "엄마");
		phone.put(2, "아빠");
		phone.put(3, "친구");
		phone.put(4, "동생");
		
		System.out.println(phone.get(2));
	}
}
