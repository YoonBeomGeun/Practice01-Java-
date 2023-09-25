package 제어문.반복문;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {
		int count = 0;
		int win = 0;
		int lose = 0;
		int same = 0;
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			count++;							//전체 횟수 카운팅
			
			//컴퓨터가 0~2를 랜덤으로 고른다.
			int computer = r.nextInt(3);		//0~2 랜덤 선택
			
			//내가 낼 거 고르기.
			System.out.print("내가 냄(0: 가위, 1: 바위, 2: 보) >> ");
			int me = sc.nextInt();
			
			//컴퓨터와 내 값 비교
			if(me == 0) {							//if, else if로 할 수 있지만, 연습겸 switch문 사용.
				switch (computer) {
				case 0:
					System.out.println("비김");
					same++;
					break;
				case 1:
					System.out.println("컴퓨터 승");
					lose++;
					break;
				case 2:
					System.out.println("내가 승");
					win++;
					break;
				}
			} else if(me == 1) {
				switch (computer) {
				case 0:
					System.out.println("내가 승");
					win++;
					break;
				case 1:
					System.out.println("비김");
					same++;
					break;
				case 2:
					System.out.println("컴퓨터 승");
					lose++;
					break;
				}
			} else if(me == 2){
				switch (computer) {
				case 0:
					System.out.println("컴퓨터 승");
					lose++;
					break;
				case 1:
					System.out.println("내가 승");
					win++;
					break;
				case 2:
					System.out.println("비김");
					same++;
					break;
				}
			}
			else {
				System.out.println("다시 골라주세요.");
			}
			
			//게임 재시작 여부
			System.out.println("더 하시겠습니다? 종료(x), 게쏙(o) >> ");
			String exit = sc.next();
			String exit2 = exit.toLowerCase();		//모두 소문자로 바꾸기
			if (exit2.equals("x")) {
				System.out.println("게임 종료");
				System.out.println("전체 횟수: " + count + "회");
				System.out.println("내가 이긴 횟수: " + win + "회");
				System.out.println("컴퓨터가 이긴 횟수: " + lose + "회");
				System.out.println("비긴 횟수: " + same + "회");
				System.exit(0);
			}
			
		}
		
	}

}
