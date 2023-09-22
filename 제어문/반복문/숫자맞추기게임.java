package 제어문.반복문;

import java.util.Random;

import javax.swing.JOptionPane;

public class 숫자맞추기게임 {

	public static void main(String[] args) {
		Random r = new Random();
		int target = r.nextInt(99)+1;
		int no = 0;
		int count = 0;
		
		while(true) {
			String data = JOptionPane.showInputDialog("숫자를 입력!!\n(1~99)");
			int data2 = Integer.parseInt(data);
			count++;
			if(data2==target) {
				JOptionPane.showMessageDialog(null, count + "번 만에 맞췄군요!\n틀린 횟수: " + no);
				System.out.println("정답!!");
				break;
			}
			else {
				no++;
				if(data2>target) {
					System.out.println("down");
				}
				else {
					System.out.println("up");
				}
			}
		}
		
	}

}
