import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpSearch {
	public static void main(String[] args) throws Exception {
		String name = "www.naver.com";
		InetAddress add = InetAddress.getByName(name);
		System.out.println(add.getHostAddress());
		System.out.println(add);
	}
}
