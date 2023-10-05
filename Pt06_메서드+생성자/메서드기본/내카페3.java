package 메서드기본;

public class 내카페3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; // 오전 온 손님
		int count2 = 4; // 오후 온 손님

		// 전체 손님 수
		int total1 = cal3.add(count1, count2);
		System.out.println("오늘 온 손님의 총 합은 " + total1 + "명입니다.");

		// 오전과 오후 손님 수 차이
		int total2 = cal3.minus(count1, count2);
		System.out.println("손님 수 차이는 " + total2 + "먕입니다.");

		// 오전 결제금액
		int total3 = cal3.cash(price, count1);
		System.out.println("오전 결제금액은 " + total3 + "원입니다.");

		// 오후 결제금액
		int total4 = cal3.cash(price, count2);
		System.out.println("오후 결제금액은 " + total4 + "원입니다.");

		// 하루 총 결제금액
		int total5 = cal3.add(total3, total4);
		System.out.println("오늘 하루 총 결제금액은 " + total5 + "원입니다.");

		// 하루 총 결제금액으로 1인당 결제금액 구하기
		double total6 = cal3.div(total5, total1);
		System.out.println("1인당 결제금액은 " + total6 + "원입니다.");
	}

}
