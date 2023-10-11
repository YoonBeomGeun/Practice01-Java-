package 컬렉션;

import java.awt.Button;
import java.util.ArrayList;

public class 리스트연습1 {

	public static void main(String[] args) {
		// 순서가 있는 데이터를 모으고 싶을 때
		// 배열? 컬렉션(리스트 형태)
		// ArrayList
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(11.2);
		list.add(true);
		list.add('a');
		list.add("yoon");
		list.add("yoon");
		list.add(new Button());
		System.out.println(list);
		// AraayList 안에 toString()이 재정의(오버라이드)
		// list 주소가 가르키는 데이터를 프린트

		System.out.println(list.get(0));
		System.out.println(list.size());

		// yoon을 꺼내서 beomgeun 붙이기
		// indexOf()는 첫 번째만 알려줌
		System.out.println(list.get(list.indexOf("yoon")) + "beomgeun");

		// for문으로 하나씩 꺼내와 데이터 출력
		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >> " + list.get(i));
		}

		// for each문 사용
		for (Object x : list) {
			System.out.println("값 >> " + x);
		}

		System.out.println(list.contains("yoon"));
		System.out.println(list.indexOf("yoon"));
		System.out.println(list.isEmpty());
		list.remove(0); // 파괴형 함수(원본을 건들임)
		list.remove(11.2);
		list.add(0, "추가"); // 0번앞에 넣어라!
		list.set(0, "또수정");
		System.out.println(list);

	}

}
