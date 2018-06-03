import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.sun.media.jfxmedia.events.NewFrameEvent;

public class Member extends JFrame implements ActionListener {
	JLabel top, t1, t2, t3, t4;
	JTextField i, p, n, t;
	JButton insert;
	
	public Member() {
		top = new JLabel("<<<<<<<회원가입화면입니다>>>>>>>");
		t1 = new JLabel("ID입력 : ");
		t2 = new JLabel("PW입력 : ");
		t3 = new JLabel("NAME입력 : ");
		t4 = new JLabel("TEL입력 : ");
		i = new JTextField(20); 
		p = new JTextField(20);
		n = new JTextField(20);
		t = new JTextField(20);
		insert = new JButton("회원가입을 진행합니다");
		
		add(top); add(t1); add(i);
		add(t2); add(p);
		add(t3); add(n);
		add(t4); add(t);
		add(insert);
		
		insert.addActionListener(this);
		insert.setBackground(Color.red);
		
		setTitle("나의 회원가입 프로그램");
		setSize(280, 300);
		setLayout(new FlowLayout());
		setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String id = i.getText();
		String pw = p.getText();
		String name = n.getText();
		String tel = t.getText();
		JDBC2 jdbc = new JDBC2();
		try {
			jdbc.insert(id, pw, name, tel);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다");
		i.setText("");
		p.setText("");
		n.setText("");
		t.setText("");
	}

	public static void main(String[] args) {
		Member member = new Member();
	}

}
