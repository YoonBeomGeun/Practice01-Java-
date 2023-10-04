package 메서드연습;

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
import javax.swing.JTextField;

public class 로그인화면 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("로그인 화면");
		f.setSize(600, 700); // void

		// 레이아웃 flowlayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); // void

		// 라벨 3개, 텍스트 필드 2개, 버튼 2개
		// font
		JLabel top = new JLabel();
		// top.setText("이미지 들어가는 곳");

		JLabel id1 = new JLabel();
		id1.setText("ID: ");

		JLabel pw1 = new JLabel();
		pw1.setText("PW: ");

		JTextField id2 = new JTextField(10);
		JTextField pw2 = new JTextField(10);

		JButton login = new JButton();
		// login.setText("로그인");
		JButton reset = new JButton();
		// reset.setText("지우기");

		// 이미지 넣기
		ImageIcon icon1 = new ImageIcon("day.jpg");
		ImageIcon icon2 = new ImageIcon("login.png");
		ImageIcon icon3 = new ImageIcon("reset.png");

		top.setIcon(icon1);
		login.setIcon(icon2);
		reset.setIcon(icon3);

		Font font = new Font("굴림", 1, 20); // ram에 지정
		top.setFont(font);
		id1.setFont(font);
		pw1.setFont(font);
		id2.setFont(font);
		pw2.setFont(font);
		login.setFont(font);
		reset.setFont(font);

		id2.setBackground(Color.pink);
		pw2.setBackground(Color.pink);
		login.setBackground(Color.green);
		reset.setBackground(Color.red);

		f.add(top);
		f.add(id1);
		f.add(id2);
		f.add(pw1);
		f.add(pw2);
		f.add(reset);
		f.add(login);

		// 버튼에 이벤트 기능 붙이기
		login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 로그인 버튼 클릭 시 처리
				// 1. id2, pw2에서 입력한 값 가져오기
				// 2. 둘다 맞으면 Good, 틀리면 Bad
				String a = id2.getText();
				String b = pw2.getText();

				if (a.equals("zz") && b.equals("111")) {
					JOptionPane.showMessageDialog(f, "WelCome");
					일기쓰기화면 diary = new 일기쓰기화면();
					diary.open();
					f.dispose();
				} else {
					JOptionPane.showMessageDialog(f, "누구세요?ㅡㅡ");
				}
			}
		});

		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 리셋 버튼 클릭 시 처리
				// id2, pw2 지우기
				id2.setText(""); // void
				pw2.setText("");
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // void
		f.setVisible(true);
	}

}
