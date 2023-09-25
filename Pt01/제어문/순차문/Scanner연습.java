package 제어문.순차문;

import java.util.Scanner;

public class Scanner연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 >> ");
		String name = sc.next();			//String으로 입력한 값을 가지고 들어옴.
		
		System.out.print("나이 입력 >> ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 >> ");
		double height = sc.nextDouble();
				
		System.out.print("몸무게 입력 >> ");
		double weight = sc.nextDouble();
		
		System.out.print("점심은? >> ");
		boolean lunch = sc.nextBoolean();
		sc.nextLine();
		System.out.print("좌우명? >> ");
		String line = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name);
		System.out.println("나이는 " + age);
		System.out.println("키는 " + height);
		System.out.println("몸무게는 " + weight);
		System.out.println("점심은? " + lunch);
		System.out.println("좌우명은 " + line);

		
	}

}
