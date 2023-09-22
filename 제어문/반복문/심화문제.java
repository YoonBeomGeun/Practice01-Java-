package 제어문.반복문;

import java.util.Scanner;

public class 심화문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//시작값, 종료값
		System.out.print("시작값 입력 >> ");
		int start1 = sc.nextInt();
		System.out.print("종료값 입력 >> ");
		int end1 = sc.nextInt();
		int sum1 = 0;

		for(int i = start1;i<=end1;i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		System.out.println();
		
		
		//시작값, 종료값, 점프값
		System.out.print("시작값 입력 >> ");
		int start2 = sc.nextInt();
		System.out.print("종료값 입력 >> ");
		int end2 = sc.nextInt();
		System.out.print("점프값 입력 >> ");
		int jump1 = sc.nextInt();
		int sum2 = 0;
		
		for(int j=start2;j<=end2;j+=jump1) {
			sum2 += j;
			if(sum2>100) {
				System.out.println(sum2);
				break;
			}
		}
		System.out.println(sum2);
		System.out.println();
	}
}
