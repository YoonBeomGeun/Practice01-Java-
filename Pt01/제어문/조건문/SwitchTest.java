package 제어문.조건문;

import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("언어를 입력 >> ");
		String name = sc.next();
		
		//데이터타입: 정수, char, String만 가능, long, 실수, 부등호 불가능
		switch(name) {
		case "자바":
			System.out.println("1101호로 go!!");
			break;
		case "파이썬":
			System.out.println("1102호로 go!!");
			break;
		case "리눅스":
			System.out.println("1103호로 go!!");
			break;
		default:
			System.out.println("집으로 go!!");
			break;
		}
	}

}
