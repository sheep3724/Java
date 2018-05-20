
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyGraphic {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(250,300);
		f.setTitle("나의 그래픽");
		JButton	b1 = new JButton("나는 버튼");
		JButton	b2 = new JButton("나도 버튼");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		b1.setBackground(Color.yellow);
		b1.setForeground(Color.blue);
		b2.setBackground(Color.red);
		b2.setForeground(Color.green);
		JLabel name = new JLabel("신찬섭");
		f.add(name);
		Font font = new Font("궁서", Font.BOLD, 50);
		f.setVisible(true);
		name.setFont(font);
	}

}
