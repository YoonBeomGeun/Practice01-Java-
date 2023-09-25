package 복습;

public class 마스크문제 {

	public static void main(String[] args) {
		//가격 계산
		int water = 1000;
		int wcount = 2;
		int mask = 2000;
		int mcount = 3;
		
		int result1 = water * wcount;
		int result2 = mask * mcount;
		System.out.println("생수값 금액은 얼마? " + result1);
		System.out.println("마스크값 금액은 얼마? " + result2);
		System.out.println("총 지불금액은 얼마? " + (result1 + result2));
		
		//과목 점수 문제
		int Korean = 75;
		int Math = 50;
		int hap = Korean + Math;
		double avg = hap/2.0;
		System.out.println("\n" + hap);
		System.out.println(avg);
		
	}

}
