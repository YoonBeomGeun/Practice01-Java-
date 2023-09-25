package 제어문.조건문;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴 입력 >> ");
		String menu = sc.next();
		
		switch(menu) {
		case "짜장면":
			System.out.println("중국집 go!!");
			break;
		case "라면":
			System.out.println("분식집 go!!");
			break;
		case "회":
			System.out.println("횟집 go!!");
			break;
		default:
			System.out.println("집으로 go!!");
			break;
		}

	}

}
