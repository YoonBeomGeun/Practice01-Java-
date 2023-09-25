package 제어문.반복문;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("test");
		
		while(true) {
			System.out.print("종료? 0, 계속  1 >> ");
			int choice = sc.nextInt();
			if(choice == 0) {
				System.out.println("종료");
				System.exit(choice);
			}
			System.out.println("실행중,,");

		}
	}

}
