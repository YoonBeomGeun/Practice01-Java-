package 자바응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 음식점주문화면2_함수밖으로 {
	static int total = 0; // 클래스 전체에서 접근 가능(전역 변수)
	// main 안에서 사용하기 위해서는 main에 static이 붙어있음
	// main밖에 있는 변수도 static이 붙어있어야 함

	static JLabel l1, l3, l4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton b1 = new JButton();
		b1.setText("짬뽕");
		JButton b2 = new JButton();
		b2.setText("우동");
		JButton b3 = new JButton();
		b3.setText("짜장");
		JButton b4 = new JButton();
		b4.setText("결제하기");

		l1 = new JLabel();
		l1.setText("개수: 0개");

		JLabel l2 = new JLabel();
		// l2.setText("이미지 들어가는 곳----------");

		ImageIcon icon = new ImageIcon("cal.png");
		l2.setIcon(icon);

		l3 = new JLabel();
		l3.setText("결제금액");

		l4 = new JLabel();
		l4.setText("감사합니다.");

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(b4);
		f.add(l4);

		Font font = new Font("맑은 굴림", 1, 50);
		Font font2 = new Font("굴림", 1, 70);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		b1.setBackground(Color.yellow);
		b2.setBackground(Color.yellow);
		b3.setBackground(Color.yellow);
		l1.setForeground(Color.blue);
		l2.setForeground(Color.blue);
		l3.setForeground(Color.blue);
		b4.setFont(font2);
		b4.setBackground(Color.yellow);

		// 버튼 클릭 리스너
		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짬뽕 선택");
				result();
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("우동 선택");
				result();
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("짜장 선택");
				result();
			}
		});

		// 결제 버튼 추가
		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("결제!!");
				cash();
			}
		});

		// X 버튼으로 종료하기
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 맨 끝으로 보내라.!
		l4.setVisible(false);
		f.setVisible(true);
	}

	// 함수를 밖으로
	public static void result() {
		total++;
		l1.setText("개수: " + total + "개");
		l3.setText("결제금액: " + total * 6000 + "원");
	}

	public static void cash() {
		if (total == 0) {
			JOptionPane.showMessageDialog(l3, "메뉴를 선택해 주세요.");
		} else {
			total = 0;
			l1.setText("개수: " + total + "개");
			l3.setText("결제금액: " + total * 6000 + "원");
			l4.setVisible(true);
			JOptionPane.showMessageDialog(l3, "결제가 완료되었습니다.");
		}

	}

}