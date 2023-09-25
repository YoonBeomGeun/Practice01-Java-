package 제어문.반복문;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 숫자비교반복문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pre = 0;
		int post = 0;
		int same = 0;
		
		while (true) {
			System.out.print("첫 번째 수 입력 >> ");
			int n1 = sc.nextInt();
			System.out.print("첫 번째 수 입력 >> ");
			int n2 = sc.nextInt();
			if (n1 > n2) {
				System.out.println("첫 번째 숫자가 더 큽니다.");
				pre++;
			} else if (n1 == n2) {
				System.out.println("두 숫자는 똑같습니다.");
				same++;
			} else {
				System.out.println("두 번째 숫자가 더 큽니다.");
				post++;
			}
			
			System.out.println("더 하시겠습니다? 종료(x), 게쏙(o) >> ");
			String exit = sc.next();
			String exit2 = exit.toLowerCase();
			if (exit2.equals("x")) {
				System.out.println("게임 종료");
				System.out.println("첫 번째 숫자가 큰 경우는 " + pre + "회");
				System.out.println("두 숫자가 같은 경우는 " + same + "회");
				System.out.println("두 번째 숫자가 큰 경우는 " + post + "회");
				System.exit(0);
			}
		}
	}
}
