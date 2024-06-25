package 형변환응용;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 증권크롤링화면만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("증권정보");
		f.setSize(500, 500);

		f.setLayout(new FlowLayout());

		JLabel code = new JLabel();
		code.setText("코드 검색: ");
		JTextField codetext = new JTextField(10);

		JButton b1 = new JButton();
		b1.setText("검색하기");

		JLabel name = new JLabel();
		name.setText("증권이름 ==> ");
		JLabel nametext = new JLabel();

		JLabel yes = new JLabel();
		yes.setText("전일가 ==> ");
		JLabel yestext = new JLabel();

		JLabel start = new JLabel();
		start.setText("시가 ==> ");
		JLabel starttext = new JLabel();

		Font font1 = new Font("굴림", 1, 20);
		code.setFont(font1);
		codetext.setFont(font1);
		b1.setFont(font1);

		Font font2 = new Font("굴림", 1, 20);
		name.setFont(font2);
		nametext.setFont(font2);
		yes.setFont(font2);
		yestext.setFont(font2);
		start.setFont(font2);
		starttext.setFont(font2);

		f.add(code);
		f.add(codetext);
		f.add(b1);
		f.add(name);
		f.add(nametext);
		f.add(yes);
		f.add(yestext);
		f.add(start);
		f.add(starttext);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 005930, 086520, 022100
				String company = codetext.getText();
				Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company);
				try {
					Document doc = conn.get();
					Elements list1 = doc.select("h2");
					Elements list2 = doc.select("td.first span.blind");

					nametext.setText(list1.get(0).text());
					yestext.setText(list2.get(0).text());
					starttext.setText(list2.get(1).text());

				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
