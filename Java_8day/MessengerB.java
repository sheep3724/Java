import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MessengerB extends JFrame implements ActionListener {
	
	DatagramSocket socket;
	DatagramPacket packet;
	JTextArea list;
	JTextField text;
	InetAddress ip;
	int myPort = 8000;
	int yourPort = 7000;
	
	public MessengerB() throws Exception {
		socket = new DatagramSocket(myPort);
		ip = InetAddress.getByName("127.0.0.1");
		setTitle("나의 메신저 B 채팅 창");
		text = new JTextField(30);
		list = new JTextArea(10, 30);
		list.setEditable(false);
		text.addActionListener(this);
		add(list, BorderLayout.CENTER);
		add(text, BorderLayout.SOUTH);
		pack();
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String s = text.getText();
		list.append("내가 보냄 >>>" + s + "\n");
		byte[] data = s.getBytes();
		InetAddress ip;
		try {
			ip = InetAddress.getByName("127.0.0.1");
			DatagramPacket packet = new DatagramPacket(data, data.length, ip, yourPort);
			socket.send(packet);
		} catch (Exception e) {
			e.printStackTrace();
		}
		text.setText("");
	}
	public void process() throws Exception {
		while(true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			list.append("내가 받은 >>> " + new String(data) + "\n");
		}
	}
	public static void main(String[] args) throws Exception {
		MessengerB name = new MessengerB(); 
		name.process();
	}

}
