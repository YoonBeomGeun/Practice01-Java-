package 스태틱;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {
	public static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("카운터 프로그램");
		f.setSize(300, 300);
		
		//FlowLayout flow = new FlowLayout();
		f.setLayout(new FlowLayout());
		
		JButton plus = new JButton("1 더하기");
		JButton reset = new JButton("0으로 초기화");
		JButton minus = new JButton("1 빼기");
		
		JLabel number = new JLabel("0");
		
		Font font1 = new Font("굴림", 1, 10);
		plus.setFont(font1);
		reset.setFont(font1);
		minus.setFont(font1);
		
		number.setFont(new Font("굴림", 1, 100));
		
		f.add(minus);
		f.add(reset);
		f.add(plus);
		f.add(number);
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count++;
				number.setText(count+"");
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count--;
				number.setText(count+"");	//String.valueOf() ==> String 타입으로 바꾸기
			}
		});
		
		reset.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				count = 0;
				number.setText(count+"");	//String.valueOf() ==> String 타입으로 바꾸기
			}
		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//EXIT_ON_CLOSE는 상수(final)
		f.setVisible(true);
	}

}
