package 자바응용;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 계산기 {

	public static void main(String[] args) {
		//필요한 부품을 ram에 가져다 놓아야 한다.
		JFrame f = new JFrame();
		f.setSize(400, 600);
		//f.setBackground(Color.green);
		//Container pane = f.getContentPane();
		//pane.setBackground(Color.green);
		//아래 코드는 위에 두 줄과 같은 코드
		f.getContentPane().setBackground(Color.CYAN);
		
		//물 흐르듯 순서대로 붙여주기
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton plus = new JButton();	//200
		plus.setText("더하기");
		JButton minus = new JButton();	//200
		minus.setText("빼 기");
		plus.setBackground(Color.yellow);
		plus.setForeground(Color.blue);
		minus.setBackground(Color.yellow);
		minus.setForeground(Color.blue);
		
		//글자 넣는 부품 Label
		JLabel l1 = new JLabel();
		l1.setText("숫자 1");
		l1.setForeground(Color.blue);
		
		//html에서 input역할
		JTextField t1 = new JTextField(10);
		t1.setBackground(Color.red);	//배경색
		t1.setForeground(Color.white);	//글자색

		JLabel l2 = new JLabel();
		l2.setText("숫자 2");
		l2.setForeground(Color.blue);

		JTextField t2 = new JTextField(10);
		t2.setBackground(Color.red);	//배경색
		t2.setForeground(Color.white);	//글자색
		
		//글자넣는 부품
		JLabel top = new JLabel();
		//이미지 부품
		ImageIcon icon = new ImageIcon("cal.png");
		top.setIcon(icon);			//이미지 올리기
		
		f.add(top);
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(plus);
		f.add(minus);
		
		//Font 설정 - 글자스타일 담당(글자체, 진하게 여부, 크기)
		Font font = new Font("궁서",1,30);
		plus.setFont(font);
		minus.setFont(font);
		l1.setFont(font);
		l2.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		
		
		//위에서 설정한 내용을 다 보여주는 역할
		f.setVisible(true);
		
	}

}
