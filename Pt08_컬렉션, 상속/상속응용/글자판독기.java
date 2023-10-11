package 상속응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자판독기 extends JFrame {
	JLabel ch, words, chCount, wordsCount;
	JTextArea area;
	JButton b1, b2, b3;

	public 글자판독기() {
		setTitle("글자판독기");
		setSize(500, 500);
		ch = new JLabel("문자 수 ==> ");
		words = new JLabel("단어 수 ==> ");
		chCount = new JLabel("문자 수 결과 들어갈 자리");
		wordsCount = new JLabel("단어 수 결과 들어갈 자리");

		area = new JTextArea(10, 25);

		b1 = new JButton("글자수 카운트");
		b2 = new JButton("배경색 변경");
		b3 = new JButton("글자색 변경");

		setLayout(new FlowLayout());

		Font font = new Font("굴림", Font.BOLD, 20);
		ch.setFont(font);
		chCount.setFont(font);
		words.setFont(font);
		wordsCount.setFont(font);
		area.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);

		area.setBackground(Color.pink);
		// getContentPane().setBackground(Color.gray);

		add(ch);
		add(chCount);
		add(words);
		add(wordsCount);
		add(area);
		add(b1);
		add(b2);
		add(b3);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 입력한 문자열을 가지고 와서 저장
				String s = area.getText();
				// 글자 수 카운트
				int num = s.length();

				// 단어 수 게산
				String[] s2 = s.split(" "); // 배열로 생성
				int num2 = s2.length;
				// 각각의 라벨에 넣기
				chCount.setText(num + ""); // 정석은 String.valueOf()
				wordsCount.setText(num2 + "");
			}
		});

		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color[] c = { Color.CYAN, Color.WHITE, Color.PINK };
				Random r = new Random();
				int x = r.nextInt(3);
				area.setBackground(c[x]);
			}
		});

		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Color[] c = { Color.CYAN, Color.WHITE, Color.PINK };
				Random r = new Random();
				int x = r.nextInt(3);
				area.setForeground(c[x]);
				if (area.getBackground().equals(area.getForeground())) {
					JOptionPane.showMessageDialog(area, "배경색과 같아 검정으로 대체합니다.");
					area.setForeground(Color.BLACK);
				}
			}
		});
	}

	public static void main(String[] args) {
		글자판독기 name = new 글자판독기();
	}

}
