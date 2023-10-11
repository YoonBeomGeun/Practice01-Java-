package 상속응용;

import java.awt.BorderLayout;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 스레드그래픽 extends JFrame {
	// setText(), setSize(), setVisible() 등을 쓸 수 있음
	// 전역변수는 자동초기화, 참조형변수()는 ==> null!
	JLabel count, image, day;

	// inner class 사용하기
	// CounterThread 클래스
	public class CounterThread extends Thread {
		@Override
		public void run() {
			for (int i = 7; i >= 0; i--) {
				count.setText("카운터 >> " + i);
				if (i == 0) {
					JOptionPane.showMessageDialog(image, "종료!");
				} else if (i <= 5) {
					System.out.println(i + "초후 종료됩니다.");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace(); // 에러출력
				}
			}
		}
	}

	// TimeCounter 클래스
	public class TimeCounter extends Thread {
		@Override
		public void run() {
			// 동시에 처리하고 싶은 내용!
			for (int i = 500; i >= 0; i--) {
				Date date = new Date();
				// System.out.println("시각>> " + date);
				day.setText("시각>> " + date);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	// 배열스레드 클래스
	public class 배열스레드 extends Thread {
		@Override
		public void run() {
			String[] list = { "영화1.jpg", "영화2.jpg", "영화3.jpg", "영화4.jpg", "영화5.jpg" };
			for (int i = 0; i < list.length; i++) {
				// System.out.println("이미지 >> " + list[i]);
				// image.setText("이미지 >> " + list[i]);
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (i == 4) {
					i = -1;
				}
			}
		}
	}

	public 스레드그래픽() {
		setTitle("나의 pc방 모니터링 시스템");
		setSize(500, 500);
		count = new JLabel("카운터 자리");
		image = new JLabel();
		day = new JLabel("시각 자리");

		// JFrame은 BorederLayout으로 이미 설정됨.
		// 동 서 남 북 가운데만 넣을 수 있음
		add(count, BorderLayout.WEST);
		add(image, BorderLayout.EAST);
		add(day, BorderLayout.SOUTH);

		CounterThread th1 = new CounterThread();
		TimeCounter th2 = new TimeCounter();
		배열스레드 th3 = new 배열스레드();

		th1.start();
		th2.start();
		th3.start();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		스레드그래픽 name = new 스레드그래픽();
	}
}
