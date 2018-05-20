import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Mycal extends JFrame implements ActionListener{
	JTextField t1, t2;
	
	public Mycal() {
		JFrame f = new JFrame();
		JLabel num = new JLabel("숫자 입력");
		JLabel num2 = new JLabel("제곱한 값");
		t1 = new JTextField(20);
		t2 = new JTextField(20);
		JButton b = new JButton("<<< 숫자를 제곱 >>>");
		b.setBackground(Color.green);
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		f.add(num);
		f.add(t1);
		f.add(num2);
		f.add(t2);
		f.add(b);
		f.setTitle("나의 제곱 계산기");
		f.setSize(250, 250);
		b.addActionListener(this);
		
		f.setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = t1.getText();
		int i1 = Integer.parseInt(s1);
		int result = i1*i1;
		t2.setText(result + "");
	}
	public static void main(String[] args) {
		Mycal cal = new Mycal();
	}

}
