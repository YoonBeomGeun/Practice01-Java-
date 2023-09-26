package 배열문제;

import java.util.Arrays;
import java.util.Random;

public class 정리문제 {

	public static void main(String[] args) {
		//랜덤한 값 1000개 - 배열
		//범위는 0~999
		
		int[] arr = new int[1000];
		Random r = new Random(18);
		// count3 = 0, count4 = 0,count5 = 0, count6 = 0;
		int[] count = new int[4];		//count도 배열로 만들어보기
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = r.nextInt(1000);
			if(arr[i]>=600) {
				//count6++;
				count[0]++;
			}else if(arr[i]>=500) {
				//count5++;
				count[1]++;

			}else if(arr[i]>=400) {
				//count4++;
				count[2]++;

			}else if(arr[i]>=300) {
				//count3++;
				count[3]++;

			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("=================");
		//System.out.println(count6);
		//System.out.println(count5);
		//System.out.println(count4);
		//System.out.println(count3);
		System.out.println(count[0]);
		System.out.println(count[1]);
		System.out.println(count[2]);
		System.out.println(count[3]);
		System.out.println("=================");

		//오름차순으로 정렬 후, 배열 전체 목록 프린트
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		//최대값, 최소값 프린트
		int min = arr[0];
		int max = arr[arr.length-1];
		System.out.println("최소값: " + min);
		System.out.println("최대값: " + max);
		
		int minCount = 0;
		int maxCount = 0;
		for(int x : arr) {
			if(x==min) {
				minCount++;
			}else if(x==max) {
				maxCount++;
			}
		}
		System.out.println(minCount);
		System.out.println(maxCount);
	}

}
