package 메서드기본;

import java.util.Arrays;
import java.util.Random;

public class 내카페2 {

	public static void main(String[] args) {
		계산기2 cal2 = new 계산기2();
		// 메서드 이름이 하나로 똑같다.
		// but, 매개변수가 다름
		// 하나의 이름으로 여러 형태를 만들 수 있음
		// 다형성(오버로딩)

		int total1 = cal2.add(1, 2);
		System.out.println(total1);

		double total2 = cal2.add(1, 2.0);
		System.out.println(total2);

		double total3 = cal2.add(1.0, 2.0);
		System.out.println(total3);

		String total4 = cal2.add("1", 2);
		System.out.println(total4);

		int[] total5 = cal2.add();
		System.out.println(Arrays.toString(total5));
		
		Random r = new Random();
		int x = r.nextInt();
		r.nextInt(3);
	}

}
