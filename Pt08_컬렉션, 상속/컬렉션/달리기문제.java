package 컬렉션;

import java.util.ArrayList;

public class 달리기문제 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("박소정"); // 1
		list.add("김정민"); // 2
		list.add("소지현"); // 3
		list.add("김개념"); // 4

		// 2등 탈락
		list.remove(1);
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.println((i + 1) + "등 >> " + list.get(i));
		}

		// 결과에 김정민이 포함되어 있나요?
		System.out.println(list.contains("김정민"));
		// 박소정은 몇 등인가요?
		System.out.println(list.indexOf("박소정") + 1 + "등"); // 없으면 -1이 출력되더라~
		// 소지현씨가 개명함. 소혜련
		list.set(list.indexOf("소지현"), "소혜련");
		System.out.println(list);
	}

}
