package 메서드활용;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 영화 {

	public static int start = 0;

	public static void main(String[] args) {
		String[] title = { "30일", "화사한 그녀", "천박사 퇴마 연구소: 설경의 비밀", "1947 보스톤", "화란" };
		String[] img = { "영화1.jpg", "영화2.jpg", "영화3.jpg", "영화4.jpg", "영화5.jpg" };
		double[] jumsu = { 7.8, 9.4, 6.0, 7.6, 6.5 };
		// System.out.println(title[0] + " " + img[0] + " " + jumsu[0]);

		JFrame f = new JFrame();
		f.setSize(350, 400);
		f.getContentPane().setBackground(Color.yellow);

		// 라벨 3개
		JLabel top = new JLabel(title[start]);
		top.setHorizontalAlignment(JLabel.CENTER);
		ImageIcon icon = new ImageIcon(img[start]);
		JLabel center = new JLabel();
		center.setIcon(icon);
		center.setHorizontalAlignment(JLabel.CENTER);

		JLabel under = new JLabel(String.valueOf(jumsu[start])); // Double을 String으로 바꿔줘야 함
		under.setHorizontalAlignment(JLabel.CENTER);
		
		// 버튼 2개
		JButton left = new JButton("<<");
		JButton right = new JButton(">>");

		// 폰트
		Font font = new Font("굴림", Font.BOLD, 20);
		top.setFont(font);
		left.setFont(font);
		right.setFont(font);
		under.setFont(font);

		// 색 지정
		left.setBackground(Color.pink);
		left.setForeground(Color.blue);
		right.setBackground(Color.pink);
		right.setForeground(Color.red);

		f.add(top, BorderLayout.NORTH);
		f.add(left, BorderLayout.WEST);
		f.add(center, BorderLayout.CENTER);
		f.add(right, BorderLayout.EAST);
		f.add(under, BorderLayout.SOUTH);

		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 0) {
					JOptionPane.showMessageDialog(f, "처음입니다. 마지막으로 돌아갑니다.");
					start = 4;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					start--;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}

			}
		});

		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (start == 4) {
					JOptionPane.showMessageDialog(f, "마지막입니다. 처음으로 돌아갑니다.");
					start = 0;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				} else {
					start++;
					top.setText(title[start]);
					under.setText(jumsu[start] + "");
					ImageIcon icon = new ImageIcon(img[start]);
					center.setIcon(icon);
				}

			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
