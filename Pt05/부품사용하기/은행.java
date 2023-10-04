package 부품사용하기;

import 부품만들기.계좌;

public class 은행 {

	public static void main(String[] args) {
		계좌 g1 = new 계좌();
		g1.이름 = "홍길동";
		g1.계좌이름 = "튼튼적금";
		g1.금액 = 1000;

		계좌 g2 = new 계좌();
		g2.이름 = "박길동";
		g2.계좌이름 = "튼튼적금";
		g2.금액 = 2000;

		계좌 g3 = new 계좌();
		g3.이름 = "홍기사";
		g3.계좌이름 = "다음적금";
		g3.금액 = 3000;

		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}

}
