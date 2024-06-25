package 형변환개념;

import java.util.ArrayList;

public class 형변환확인문제 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); // int
		me.add(189.1); // double
		me.add(false); // boolean
		me.add('남'); // character
		System.out.println(me);

		// Object ==> Integer ==> int
		int sum = (Integer) me.get(0) + 2000;
		System.out.println(sum);

		// Object ==> double
		double h = (double) me.get(1) + 10;
		System.out.println(h);

		// Object ==> boolean
		boolean m = (Boolean) me.get(2);
		if (m == true) {
			System.out.println("배불러요");
		} else {
			System.out.println("배고파요");
		}

		// Object =다운캐스팅=> Character =오토언박싱=> char
		char c = (char) me.get(3);
		if (c == '남') {
			System.out.println("주민번호는 1, 3");
		} else {
			System.out.println("주민번호는 2, 4");
		}

		// ArrayList에는 다양한 타입을 넣을 수 있긴 함
		// 실제로 코드할 때는 다양한 타입을 넣는 경우가 흔치 않음
		// 매번 넣을 때마다 형변환을 하기 힘듦
		ArrayList<String> list = new ArrayList<String>();
		// <>를 제너릭(제너럴, 일반적인) 프로그래밍 이라고 함
		// 객체 생성 시 타입을 결정
		// <>안에 기본형 타입은 사용불가. <클래스>만 가능.

		list.add("윤");
		list.add("범");
		list.add("근");
		String s = list.get(0); // 형변환 필요 없음.
		System.out.println(s);

	}

}
