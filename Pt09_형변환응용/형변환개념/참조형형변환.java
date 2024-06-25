package 형변환개념;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 참조형 형변환은 상속관계에서만 가능
		// 가변길이, 타입이 여러 개일 때 사용
		// list = {a, b, c}; (가변길이)
		// list = {b, c}; 데이터 변경이 있을 때 자리를 옮김 - 자리 옮김
		// 데이터 변경이 너무 많을 때는 사용이 불편(ram이 계속 일함)
		// 때문에 ArrayList 권장

		ArrayList list = new ArrayList();
		list.add("String"); // String(작은) ==> Object(큰)
		// 자동으로 Object 타입으로 변환되어 들어감 - 자동형변환
		list.add(100); // Integer(작은) ==> Object(큰)
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("값 >>" + list.get(i));
		}

		// list에 있는 거 각각 꺼내서 변수에 넣어보기
		String s = (String) list.get(0); // Object(큰) ==> String(작은)
		// cpu가 강제로 String 타입으로 변환해서 변수에 넣어줌 - 강제형변환 필요
		// Casting

		list.add(new JButton("나는 버튼"));

		// 오류 - Type mismatch: cannot convert from Object to JButton
		JButton b1 = (JButton) list.get(2); // 강제형변환
	}

}
