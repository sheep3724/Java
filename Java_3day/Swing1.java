import javax.swing.JOptionPane;

public class Swing1 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("이름을 입력하세요.");
		String birth = JOptionPane.showInputDialog("태어난해를 입력하세요.");
		JOptionPane.showMessageDialog(null,name);
		int birth2 = Integer.parseInt(birth);
		JOptionPane.showMessageDialog(null,2018-birth2 + 1);
	}

}
