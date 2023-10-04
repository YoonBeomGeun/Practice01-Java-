package 부품사용하기;

import 부품만들기.TV;
import 부품만들기.전화기;

public class 우리집 {

	public static void main(String[] args) {
		TV myTv = new TV(); // 4개의 변수 생성
		myTv.ch = 7;
		myTv.vol = 9;
		myTv.onOff = false;

		TV yourTv = new TV(); // 4개의 변수 생성
		yourTv.ch = 9;
		yourTv.vol = 12;
		yourTv.onOff = true;
		// ram에 주소 + 멤버변수를 힙영역에 만들어준다. 4개

		System.out.println(myTv.ch);
		System.out.println(myTv.vol);
		System.out.println(myTv.onOff);
		System.out.println();

		전화기 p1 = new 전화기(); // 3개의 변수 생성
		p1.size = 11;
		p1.speaker = "바나나사";
		System.out.println("p1 >> " + p1); // 주소값이 출력됨. p2와는 다른 주소

		전화기 p2 = new 전화기();
		p2.size = 9;
		p2.speaker = "메론사";
		System.out.println("p2 >> " + p2);

		System.out.println("사이즈는 " + p1.size + ", 회사는 " + p1.speaker);
		System.out.println("사이즈는 " + p2.size + ", 회사는 " + p2.speaker);

		p2.인터넷하다();
		System.out.println();

		// toString()은 언제 호출되나?
		// 참조형 변수를 프린트할 때 자동으로 호출.
		// 원래 있는 toString()은 참조형변수 프린트할 때 무조건 호출
		// 패키지명.클래스명@주소관리코드값
	}

}
