package music;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class MP3Player extends JFrame implements ActionListener {
	JLabel text; //변수의 선언의 위치가 사용범위! 포함하고 있는 {} 에서 다 사용가능.
	JButton play, stop;
	MediaPlayer mp3;
	
	public MP3Player() {
		JFXPanel fx = new JFXPanel();
		text = new JLabel("다음의 버튼을 클릭해주세요");
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		setTitle("나의 mp3플레이어");
		setSize(200, 200);
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		setVisible(true);
		add(text);
		add(play);
		add(stop);
		play.addActionListener(this);
		//this : 상속받았을때 자식 클래스. 자기 자신 클래스
		//super : 상속받았을때 부모 클래스.
		stop.addActionListener(this);
		
		Media m = new Media("file:/c:/temp/music.mp3");
		mp3 = new MediaPlayer(m);
		setVisible(true);
		
	} 
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == play) {
			mp3.play();
		}
		if(e.getSource() == stop) {
			mp3.stop();
		}
	}

	public static void main(String[] args) {
		MP3Player mp = new MP3Player();
	}

}