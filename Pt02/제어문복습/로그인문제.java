package 제어문복습;

import java.util.Scanner;

public class 로그인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		
		String result = "";
		
		if(id.equals("root") && pw.equals("1234")) {
			result = "성공";
		}
		else {
			result = "실패";
		}
		System.out.println(result);
	}

}
