package 자바응용;

import java.awt.Color;
import java.awt.Component;
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

public class 계산기 {

	public static void main(String[] args) {
		// 필요한 부품을 ram에 가져다 놓아야 한다.
		JFrame f = new JFrame();
		f.setSize(350, 700);
		// f.setBackground(Color.green);
		// Container pane = f.getContentPane();
		// pane.setBackground(Color.green);
		// 아래 코드는 위에 두 줄과 같은 코드
		f.getContentPane().setBackground(Color.CYAN);

		// 물 흐르듯 순서대로 붙여주기
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);

		JButton plus = new JButton(); // 200
		plus.setText("더하기");
		JButton minus = new JButton(); // 200
		minus.setText("빼 기");
		plus.setBackground(Color.yellow);
		plus.setForeground(Color.blue);
		minus.setBackground(Color.yellow);
		minus.setForeground(Color.blue);

		// 글자 넣는 부품 Label
		JLabel l1 = new JLabel();
		l1.setText("숫자 1");
		l1.setForeground(Color.blue);

		// html에서 input역할
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red); // 배경색
		t1.setForeground(Color.white); // 글자색

		JLabel l2 = new JLabel();
		l2.setText("숫자 2");
		l2.setForeground(Color.blue);

		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red); // 배경색
		t2.setForeground(Color.white); // 글자색

		// 글자넣는 부품
		JLabel top = new JLabel();
		// 이미지 부품
		ImageIcon icon = new ImageIcon("cal.png");
		top.setIcon(icon); // 이미지 올리기
		
		// 결과값이 출력되는 라벨
		JLabel under = new JLabel();
		under.setText("결과값");

		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		f.add(under);

		// Font 설정 - 글자스타일 담당(글자체, 진하게 여부, 크기)
		Font font = new Font("궁서", 1, 30);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		under.setFont(font);

		// 1. plus버튼 클릭했을 때 액션처리 설정
		// 2. 어떤 부품이 할지를 ram에 만들어서 넣기
		// 3. 그 부품안에 있는 함수(기능)을 사용해야 우리가 원하는 버튼 처리 기능을 사용할 수 있음.
		plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 여기에 버튼을 클릭했을 때 처리 내용을 써주면 됨.
				System.out.println("플러스");
				// t1, t2의 글자를 가지고 와서 ram에 저장
				String s1 = t1.getText();
				String s2 = t2.getText();

				// 값이 들어있지 않으면 NumberFormatException 에러 발생
				// 에러처리(2 가지 방법)
				// 1번: equals를 통해 공백("")인지 확인
				// 2번: length를 이용해서 글자의 수를  확인(1보다 작은지)
				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "숫자를 입력하세요!");
				} else {
					// 숫자로 변경해서 그 결과값을 모니터에 출력
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int sum = n1 + n2;

					System.out.println("더한 값은: " + sum);
					//JOptionPane.showMessageDialog(f, "더한 값은: " + sum);
					under.setText("더한 값은: " + sum);
					// t1, t2 값 지우기
					t1.setText("");
					t2.setText("");
				}
			}
		});

		minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("마이너스");
				// t1, t2의 글자를 가지고 와서 ram에 저장
				String s1 = t1.getText();
				String s2 = t2.getText();
				if (s1.equals("") || s2.equals("")) {
					JOptionPane.showMessageDialog(f, "숫자를 입력하세요!");
				} else {
					// 숫자로 변경해서 그 결과값을 모니터에 출력
					int n1 = Integer.parseInt(s1);
					int n2 = Integer.parseInt(s2);
					int minus = n1 - n2;

					System.out.println("뺀 값은: " + minus);
					//JOptionPane.showMessageDialog(f, "뺀 값은: " + minus);
					under.setText("뺀 값은: " + minus);
					t1.setText("");
					t2.setText("");
				}
			}
		});

		// x 누르면 종료!
		// 이 설정이 없으면 보이지만 않게 되는 것임.
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 위에서 설정한 내용을 다 보여주는 역할
		f.setVisible(true);

	}

}
