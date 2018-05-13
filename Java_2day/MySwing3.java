import javax.swing.JOptionPane;

public class MySwing3 {

	public static void main(String[] args) {
		String name =JOptionPane.showInputDialog("이름");
		String school = JOptionPane.showInputDialog("학교");
		String study = JOptionPane.showInputDialog("과목");
		System.out.println("나의 이름은 : " + name);
		System.out.println("나의 학교는 : " + school);
		System.out.println("공부과목은 : " + study);
	}

}
