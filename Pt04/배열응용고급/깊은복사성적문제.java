package 배열응용고급;

import java.util.Arrays;

public class 깊은복사성적문제 {

	public static void main(String[] args) {
		String[] 과목명 = { "국어", "영어", "수학", "컴퓨터", "회화" };
		int[] term1 = {44, 66, 22, 99, 100};
		int[] term2 = term1.clone();
		term2[0] = 22;
		term2[2] = 88;
		System.out.println(Arrays.toString(term1));
		System.out.println(Arrays.toString(term2));
		
		int count1 = 0;
		int count2 = 0;
		for(int i=0;i<term1.length;i++) {
			if(term1[i] == term2[i]) {
				count1++;
			}else if(term1[i] < term2[i]) {
				count2++;
				System.out.println("성적이 오른 과목: " + 과목명[i]);
			}
		}
		System.out.println("성적이 동일한 학생 수: " + count1);
		System.out.println("성적이 오른 학생 수: " + count2);
	}

}
