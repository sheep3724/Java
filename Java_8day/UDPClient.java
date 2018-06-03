import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPClient {
	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(5000);
		System.out.println("클라이언트 구동시작");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		socket.receive(packet);
		System.out.println("서버로 부터 정보 수신 완료!!!");
		System.out.println(new String(data));
		
	}
}
