package company;

public class StringTest {
	public static void main(String[] args) {
		String s = "I love Java";
		String java = s.substring(7);
		System.out.println(java);
		System.out.println(s.substring(7, 9));
		System.out.println(s.substring(2, 6));
		System.out.println("--------------------");
		String s2 = "1:감사합니다.";
		String s3 = "2:고맙습니다.";
		System.out.println(s2.charAt(0));
		if(s2.charAt(0) == '1')
		{
			System.out.println("1번 입니다.");
		}
		String[] s4 = s2.split(":");
		System.out.println(s4[0]);
		System.out.println(s4[1]);
	}
}
