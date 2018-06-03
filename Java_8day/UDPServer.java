import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPServer {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(6000);
		String s = "I am happy";
		byte[] data = s.getBytes();
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5000);
		socket.send(packet);
		System.out.println("클라이언트에게 데이터전송 완료");
		socket.close();
	}

}

