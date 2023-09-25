package 배열응용;

import java.util.Scanner;

public class 확인테스트2 {

	public static void main(String[] args) {
		//배열의 값을 입력받아 첫 번째와 세 번째 값의 합 구하기
		int[] addr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<addr.length;i++) {
			System.out.print(i+1 + "번 째값 입력 >> ");
			addr[i] = sc.nextInt();
		}
		int result = addr[0] + addr[2];
		System.out.println("첫 번째와 세 번째 값의 합은: " + result);
		
		System.out.println();
		
		//String 타입의 데이터를 입력받아 출력하기
		String[] s1 = new String[3];
		for(int j=0;j<s1.length;j++) {
			System.out.print("언어를 입력하세요 >> ");
			s1[j] = sc.next();
		}
		String result2 = s1[0] + "보다는 " + s1[1];
		System.out.println(result2);
	}

}
