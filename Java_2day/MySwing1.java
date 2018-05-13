import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MySwing1 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		f.setTitle("Hello");
		JButton b = new JButton("나를 누르세요.");
		f.setLayout(new FlowLayout());
		f.add(b);
		b.setForeground(Color.red);
		b.setBackground(Color.blue);
		f.setVisible(true);
	}

}
