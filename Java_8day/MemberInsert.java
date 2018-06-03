import java.util.Scanner;

public class MemberInsert {
	public static void main(String[] args) throws Exception {
		JDBC2 jdbc = new JDBC2();
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		String name = sc.next();
		String tel = sc.next();
		jdbc.insert(id, pw, name, tel);
		System.out.println("회원가입이 완료되었습니다.");
	
	}
}
