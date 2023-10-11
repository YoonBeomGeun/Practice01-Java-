package 컬렉션;

import java.util.HashMap;

public class 맵연습1 {

	public static void main(String[] args) {
		// map - 맵핑시키기, 연결시키기
		// 키 : 값의 쌍으로 매핑해서 연결 저장
		HashMap map = new HashMap();
		map.put("apple", "사과");
		map.put("melon", "멜론");
		map.put("ice", "아이스크림");
		System.out.println(map); // toString이 오버라이딩 되어있음, 정렬도 되어있음
		System.out.println(map.get("apple"));
		map.remove("apple");
		System.out.println(map);
		map.replace("ice", "아이스크림", "초코아이스크림");
		System.out.println(map);
	}

}
