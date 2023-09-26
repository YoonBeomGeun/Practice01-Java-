package 배열문제;

import java.util.Arrays;
import java.util.Scanner;

public class 여행문제 {

	public static void main(String[] args) {
		String[] year1 = new String[3];
		String[] year2 = new String[3];
		
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<year1.length;i++) {
			System.out.print("작년에 가고 싶었던 곳 입력 >> ");
			year1[i] = sc.next();
		}
		for(int i=0;i<year1.length;i++) {
			System.out.print("올해 가고 싶었던 곳 입력 >> ");
			year2[i] = sc.next();
		}
		//비교하기
		int[] same = {3, 3, 3};		//절대 나오지 않을 숫자를 넣어줌.
		int sCount = 0;
		int dCount = 0;
		for(int i=0;i<year1.length;i++) {
			if(year1[i].equals(year2[i])) {
				sCount++;
				same[i] = i;
			}else {
				dCount++;
			}
		}
		System.out.println("동일한 장소의 개수: " + sCount);
		for(int x : same) {
			if(x!=3) {				//절대 나오지 않을 숫자인 3이 아닌 수에 해당하는 배열값을 출력
				System.out.print(year1[x] + " ");
			}
		}
		System.out.println();
		System.out.println("다른 장소의 개수: " + dCount);
		
	}

}
