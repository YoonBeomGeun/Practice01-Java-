package 제어문.반복문;

import java.util.Scanner;

public class 투표문제 {

	public static void main(String[] args) {
		
		int iu = 0;
		int yoo = 0;
		int bts = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			System.out.print("입력. 1)아이유 2)유재석 3)방탄 4)종료 >> ");
			int sel = sc.nextInt();
			if (sel == 1) {
				iu++;
			} else if (sel == 2) {
				yoo++;
			} else if (sel == 3) {
				bts++;
			} else {
				System.out.println("투표를 종료합니다.");
				System.out.println("아이유 득표 수: " + iu);
				System.out.println("유재석 득표 수: " + yoo);
				System.out.println("방탄 득표 수: " + bts);
				System.exit(0);
			}
		}
		
	}

}
