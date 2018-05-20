
public class Array_test4 {
	public static void main(String[] args) {
		int[] age = {55,45,15,5};
		for (int i = 0; i < age.length; i++) {
			System.out.println(age[i]);
		}
		for (int a : age) {
			System.out.println(a);
		}
		double[] eye = {1.5,0.9,0.5,1.7};
		for (double d : eye) {
		System.out.println(d);	
		}
		char[] gender = {'남','여','여','남'};
		for (char c : gender) {
			System.out.println(c);
		}
		String[] hobby = {"등산","독서","여행","자전거"};
		for (String string : hobby) {
			System.out.println(string);
		}
		 
	}
}
