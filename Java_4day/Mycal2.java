import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mycal2 extends JFrame implements ActionListener{
	JTextField t1, t2, t3;
	JLabel num1, num2, img, countText;
	JButton b1, b2, b3;
	int count = 0;
	public Mycal2() {
		
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		t3 = new JTextField(20);
		num1 = new JLabel("숫자1 >>> ");
		num2 = new JLabel("숫자2 >>> ");
		img = new JLabel();
		countText = new JLabel();
		ImageIcon twice1 = new ImageIcon("1.jpg");
		img.setIcon(twice1);
		b1 = new JButton("두수를 더하는 버튼");
		b2 = new JButton("이미지를 바꾸는 버튼");
		b3 = new JButton("1증가");
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(num1);
		add(t1);
		add(num2);
		add(t2);
		add(b1);
		add(b2);
		add(b3);
		add(t3);
		add(img);
		add(countText);
		setSize(500, 750);
		setTitle("나의 덧셈 계산기");
		t1.setBackground(Color.yellow);
		t2.setBackground(Color.green);
		t3.setBackground(Color.pink);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b2) {
			ImageIcon twice2 = new ImageIcon("2.jpg");
			img.setIcon(twice2);
		}
		if(e.getSource() == b1) {
			String s1 = t1.getText();
			String s2 = t2.getText();
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			int result = i1+i2;
			t3.setText(result + "");
		}
	
		if(e.getSource() == b3) {
			count++;
			Font font = new Font("궁서", Font.BOLD, 50);
			countText.setFont(font);
			countText.setText(count + "");
		}

	}
	public static void main(String[] args) {
		Mycal2 name = new Mycal2();
	}
}
