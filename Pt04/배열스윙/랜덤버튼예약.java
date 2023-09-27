package 배열스윙;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 랜덤버튼예약 {
	// 전역변수 선언
	static int count = 0; // main에 static이 있으므로 static 필요
	static String no = null;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("예약 버튼 만들기");
		FlowLayout flow = new FlowLayout(); // 위치 알아서 잡아줌, setBounds 필요 X
		f.setLayout(flow);
		Container contain = f.getContentPane(); // Container
		contain.setBackground(Color.pink); // f에 배경색 넣는 법

		JButton[] buttons = new JButton[100];
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			// buttons[i].setText(i+""); //int를 String으로 바꿔줌
			buttons[i].setText(String.valueOf(i)); // 정석적인 방법
		}
		

		Font font = new Font("굴림", 1, 20);
		Font font2 = new Font("굴림", 1, 7);

		JLabel l1 = new JLabel();
		l1.setText("결제금액: 0원");
		l1.setFont(font);

		for (int i = 0; i < buttons.length; i++) {

			buttons[i].setFont(font);
			f.add(buttons[i]);

			// 버튼을 클릭했을 때 동작 추가
			buttons[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					String s = e.getActionCommand();
					no = no + s + "";
					int pay = count * 10000;

					// 누른 버튼의 source 가져오기(Object)
					JButton b = (JButton) e.getSource();
					b.setBackground(Color.red); // 누른 버튼의 배경색 변경
					b.setFont(font2);
					b.setText("예약됨.");
					b.setEnabled(false); // 누른 버튼은 사용못하도록 설정
					
					JOptionPane.showMessageDialog(f, s + "번을 클릭하셨군요!\n현재  결제금액은 " + pay + "원입니다.");
					l1.setText("결제금액: " + pay + "원");

				}
			});
		}

		f.add(l1);

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
