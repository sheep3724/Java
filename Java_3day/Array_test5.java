
public class Array_test5 {
	public static void main(String[] args) {
		int array[] = {10,40,50,80};
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i];
			if(i==1) {
				array[i] = 22;
			}
			System.out.println(array[i]);
		}
	}
}
