package 배열응용;

import java.util.Arrays;
import java.util.Random;

public class 수능문제 {

	public static void main(String[] args) {
		//10000명의 수능점수를 저장할 공간 ==> 베열
		//랜덤하게 데이터 만들어주는 부품 ==> 랜덤
		
		int[] jumsu = new int[10000];		//초기값 전부 0
		Random r = new Random(18);			//seed값 18
		
		for(int i=0;i<jumsu.length;i++) {
			jumsu[i] = r.nextInt(451);		//0~450
		}
		System.out.println(Arrays.toString(jumsu));
		System.out.println("=================");
		
		//평균 구하기
		int sum = 0;
		for(int x : jumsu) {
			sum = sum + x;
		}
		System.out.println("평균은 " + (double)sum/jumsu.length);
		System.out.println("=================");

		//최댓값, 최소값 구하기
		//cpu가 ram의 값을 변경해버림. ==> 파괴형함수
		Arrays.sort(jumsu);		//ram에 들어있는 10000개의 데이터를 정렬해 줌.
		
		String data = "100";
		//cpu가 ram의 값을 변경하지 않는다. ==> 비파괴형함수
		int data2 = Integer.parseInt(data);
		
		//Arrays.toString(jumsu); ==> 비파괴형함수
		//Double.parseDouble(data); ==> 비파괴형함수
		
		int min = jumsu[0];
		int max = jumsu[jumsu.length-1];
		System.out.println("최소 점수: " + min);
		System.out.println("최고 점수: " + max);
		//점수가 최소값인 사람의 수, 점수가 최대값인 사람의 수 프린트
		//배열을 순서대로 순회해서 데이터 접근
		int minCount = 0, maxCount = 0;
		for(int i=0;i<jumsu.length;i++) {
			if(jumsu[i] == min) {
				minCount++;
			}else if(jumsu[i] == max) {
				maxCount++;
			}
		}
		System.out.println(minCount);
		System.out.println(maxCount);
		System.out.println("=================");

		//300점 이상이 사람의 수
		int samCount = 0;
		for(int i=0; i<jumsu.length;i++) {
			if(jumsu[i]>=300) {
				samCount++;
			}
		}
		System.out.println(samCount);
	}

}
