package company;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pizza extends JFrame implements ActionListener{
	JPanel p;
	JButton b1, b2, b3;
	JLabel t1, t2;
	JTextField countText;
	int count, combo, potato, bulgogi;
	
	Pizza() {
		setTitle("나의 피자 메뉴판");
		setSize(800, 200);
		p = new JPanel();
		b1 = new JButton("콤보피자");
		b2 = new JButton("포테이토피자");
		b3 = new JButton("불고기피자");
		t1 = new JLabel("자바 피자에 오신것을 환영합니다. 피자의 종류를 선택해주세요");
		t2 = new JLabel("개수");
		countText = new JTextField(30);
		p.add(b1);p.add(b2);p.add(b3);
		p.add(t2);p.add(countText);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		add(t1);add(p);
		p.setBackground(Color.red);
		b1.setBackground(Color.green);
		b1.setForeground(Color.yellow);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		if(e.getSource() == b1) {
			combo++;
		}
		else if(e.getSource() == b2)
		{
			potato++;
		}
		else
		{
			bulgogi++;
		}
		countText.setText("total : " + count + ", combo피자 : " + combo + ", potato피자 : " + potato + ", bulgogi피자 : " + bulgogi);
	}

}
