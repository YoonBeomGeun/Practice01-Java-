package 배열스윙;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 많은버튼만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700,500);
		f.setTitle("나의 버튼들");
		f.setLayout(null);		//주소를 지정하지 않겠다. -> setBounds로 지정 가능
		
		JButton[] buttons = new JButton[100];
		//아직은 전부 null. 참조형 배열은 초기값이 null, {null, null, null,,,}
		
		for(int i=0;i<100;i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼 " + i);
		}
		
//		JButton b1 = new JButton();
//		b1.setText("버튼1");
//		b1.setBounds(250, 150, 100, 100);	//가로위치, 세로위치, 가로크기, 세로크기
//		b1.setBackground(Color.CYAN);
//		b1.setForeground(Color.yellow);
//		f.add(b1);
		
		Random r = new Random();
		for(int i=0; i<buttons.length;i++) {
			int x = r.nextInt(600);
			int y = r.nextInt(400);
			buttons[i].setBounds(x, y, 50, 50);
			buttons[i].setBackground(Color.cyan);
			buttons[i].setForeground(Color.yellow);
			f.add(buttons[i]);
		}
	
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//맨 끝으로 보내기
		f.setVisible(true);
	}

}
