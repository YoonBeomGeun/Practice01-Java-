package 메서드연습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 일기쓰기화면 {
	// 멤버변수
	// 멤버메서드

	public static void main(String[] args) {

	}

	public void open() {
		JFrame f = new JFrame();
		f.setTitle("일기장 쓰기 화면");
		f.setSize(400, 500);
		f.getContentPane().setBackground(Color.gray); // 배경색 설정

		// FlowLayout
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		// 라벨 3개, 텍스트 필드 2개, 텍스트 area 1개, 버튼 1개
		JLabel date1 = new JLabel();
		date1.setText("오늘의 날짜");

		JLabel title1 = new JLabel();
		title1.setText("오늘의 제목");

		JLabel content1 = new JLabel();
		content1.setText("오늘의 내용");

		JTextField date2 = new JTextField(15);

		JTextField title2 = new JTextField(15);

		JTextArea content2 = new JTextArea(5, 15); // 5줄, 15글자씩

		JButton b1 = new JButton();
		b1.setText("=======파일에 일기 저장=======");

		// 파일 삭제 기능 추가
		JLabel search1 = new JLabel();
		search1.setText("삭제할 파일명");

		JTextField search2 = new JTextField(15);

		JButton b2 = new JButton();
		b2.setText("=======파일 삭제=======");

		Font font = new Font("굴림", 1, 17);
		date1.setFont(font);
		title1.setFont(font);
		content1.setFont(font);
		date2.setFont(font);
		title2.setFont(font);
		content2.setFont(font);
		b1.setFont(font);
		search1.setFont(font);
		search2.setFont(font);
		b2.setFont(font);

		date1.setForeground(Color.white);
		title1.setForeground(Color.white);
		content1.setForeground(Color.white);
		date2.setBackground(Color.pink);
		date2.setForeground(Color.white);
		title2.setBackground(Color.pink);
		title2.setForeground(Color.white);
		content2.setBackground(Color.pink);
		content2.setForeground(Color.white);
		b1.setBackground(Color.white);
		b1.setForeground(Color.cyan);
		search1.setForeground(Color.white);
		search2.setBackground(Color.pink);
		search2.setForeground(Color.white);
		b2.setBackground(Color.white);
		b2.setForeground(Color.cyan);

		f.add(date1);
		f.add(date2);
		f.add(title1);
		f.add(title2);
		f.add(content1);
		f.add(content2);
		f.add(b1);
		f.add(search1);
		f.add(search2);
		f.add(b2);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e2) {
				String day = date2.getText();
				String tt = title2.getText();
				String cc = content2.getText();

				try {
					FileWriter file = new FileWriter(day + ".txt");
					file.write(day + "\n");
					file.write(tt + "\n");
					file.write(cc + "\n");
					file.close(); // stream 닫기, 안 닫으면 자리차지함.

				} catch (IOException e) {
					System.out.println("에러 발생");
					e.printStackTrace(); // 자세하게 에러정보를 볼 수 있음
				}

				date2.setText("");
				title2.setText("");
				content2.setText("");

				File dir = new File("."); // 현재위치 (프로젝트 폴더)
				String[] list = dir.list();
				int count = 0;
				for (String x : list) {
					if (x.contains(".txt")) {
						System.out.println(x);
						count++;
					}
				}
				System.out.println(count);
			}
		});

		// 파일 삭제 버튼 클릭 시
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String s = search2.getText();
				File f1 = new File(s + ".txt");
				if (f1.exists()) {
					f1.delete();
					JOptionPane.showMessageDialog(f, "삭제 완료");
				} else {
					JOptionPane.showMessageDialog(f, "해당 파일이 없습니다.");
				}
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
