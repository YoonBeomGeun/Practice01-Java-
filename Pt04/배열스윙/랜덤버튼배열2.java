package 배열스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 700);
		f.setTitle("여러 버튼 만들기");
		f.setLayout(null);
		Container contain = f.getContentPane(); // Container
		contain.setBackground(Color.pink); // f에 배경색 넣는 법

		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setText("버튼 " + i);
		}

		Random r = new Random();
		Color[] c = { Color.cyan, Color.yellow, Color.green, Color.white, Color.orange };
		// 색 배열 생성
		Font font = new Font("굴림", 1, 10);

		for (int i = 0; i < buttons.length; i++) {
			int x = r.nextInt(800);
			int y = r.nextInt(500);
			int w = r.nextInt(100); // 버튼 가로길이 랜덤생성
			int h = r.nextInt(50); // 버튼 세로길이 랜덤생성
			int z = r.nextInt(5); // 색 랜덤지정을 위함
			buttons[i].setBounds(x, y, w, h);
			buttons[i].setBackground(c[z]); // 랜덤하게 나온 색 적용
			// buttons[i].setForeground(Color.black); //글자색 지정
			buttons[i].setFont(font);
			f.add(buttons[i]);

			// 버튼을 클릭했을 때 동작 추가
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// 버튼 위에 글자를 가지고 와줘!
					String s = e.getActionCommand();
					JOptionPane.showMessageDialog(f, s + "번을 클릭!!");
				}
			});
		}

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
