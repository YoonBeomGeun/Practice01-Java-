package 제어문.조건문;

import java.util.Scanner;

public class IfElseIfTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("언어를 입력 >> ");
		String name = sc.next();
		
		if(name.equals("자바")) {
			System.out.println("1101호로 go!!");
		}
		else if(name.equals("파이썬")) {
			System.out.println("1102호로 go!!");
		}
		
		else if(name.equals("리눅스")) {
			System.out.println("1103호로 go!!");
		}
		else {
			System.out.println("집으로 go!!");
		}
	}

}
