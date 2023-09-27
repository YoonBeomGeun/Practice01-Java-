package 배열응용고급;

import java.util.Arrays;
import java.util.Scanner;

public class 스트링활용 {

	public static void main(String[] args) {
		String s = "감자,고구마,양파";
		String[] s2 = s.split(",");
		System.out.println(s2.length);

		String s3 = "   홍길동";
		System.out.println(s3.trim());
		s3 = s3.replace("   ", "");
		System.out.println(s3);

		String s6 = "홍길동";
		char c6 = s6.charAt(0);
		if (c6 == '홍') { // char형이라서 == 가능, String이면 .equals
			System.out.println("홍씨 가문");
		} else {
			System.out.println("홍씨 가문 아님");
		}

		char[] c7 = s6.toCharArray(); // {'홀', '길', '동'}
		System.out.println(c7[0]);

		// 날씨를 입력받아 배열에 넣기
		Scanner sc = new Scanner(System.in);
		System.out.println("날씨 입력 >> ");
		String nal = sc.next();
		String[] nal2 = nal.split(",");
		int count = 0;
		for (int i = 0; i < nal2.length; i++) {
			if (nal2[i].equals("흐림")) {
				count++;
			}
		}
		System.out.println(Arrays.toString(nal2));
		System.out.println("흐림은 " + count + "번");
	}

}
