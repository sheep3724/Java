
public class Array_test2 {
	public static void main(String[] args) {
		int[] s = new int[100];
		s[0] = 1000;//0=>첫번째 위치값(index)
		s[99] = 10000;//99=>마지막 위치값 99=갯수-1 99=s.length-1
		s[54] = 5000;
		
		System.out.println(s.length);
		System.out.println(s[0]);
		System.out.println(s[99]);
		System.out.println(s[88]);
	}
}
