package 컬렉션;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 확인문제 {

	public static void main(String[] args) {

		// 여행지 5곳, 중복된 지역은 제외
		HashSet list = new HashSet();
		list.add("강원도");
		list.add("인천");
		list.add("서울");
		list.add("청주");
		list.add("합천");
		list.add("인천");
		System.out.println(list);

		// 각 방에 물건 배치
		// 현관에는 무엇이 있는가
		// 거실에 있는 것을 책상으로 바꿔라
		HashMap map = new HashMap();
		map.put("안방", "TV");
		map.put("거실", "쇼파");
		map.put("부엌", "냉장고");
		map.put("현관", "신발");
		System.out.println(map);
		System.out.println(map.get("현관"));
		map.replace("거실", "쇼파", "책상");
		System.out.println(map);

		// 내가 할 일
		// 처음 일과 마지막 일을 출력
		// 마지막 일을 "청소"로 교체
		ArrayList list2 = new ArrayList();
		list2.add("자바");
		list2.add("데베");
		list2.add("코테");
		list2.add("밥");
		list2.add("잠자기");
		System.out.println(list2);
		System.out.println(list2.get(0));
		System.out.println(list2.get(list2.size() - 1));
		list2.set(list2.size() - 1, "청소");
		System.out.println(list2);

	}

}
