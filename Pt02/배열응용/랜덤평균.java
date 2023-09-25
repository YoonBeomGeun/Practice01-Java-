package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 랜덤평균 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] n2 = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			n2[i] = r.nextInt(100);
			//System.out.println(n);
		}
		System.out.println(Arrays.toString(n2));
		
		//for 문을 이용해 누적값을 구한 후, 평균 구하기
		int sum = 0;
		for(int x : n2) {
			sum+=x;
		}
		System.out.println((double)sum/n2.length);
	}

}
