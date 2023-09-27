package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 전화번호분리 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호입력 >> ");
		String num = sc.next();
		String[] num2 = num.trim().split("-"); // 양쪽 공백 제거 및 "-"를 기준으로 분히
		System.out.println(Arrays.toString(num2));
		// 조건 1
		if (num2[0].equals("011")) {
			System.out.println("SK");
		} else if (num2[0].equals("019")) {
			System.out.println("KT");
		} else {
			System.out.println("Apple");
		}

		// 조건 2
		if (num2[1].length() >= 4) {
			System.out.println("최신폰");
		} else {
			System.out.println("올드폰");
		}

		// 조건 3
		if ((num2[0] + num2[1] + num2[2]).length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}

	}

}
