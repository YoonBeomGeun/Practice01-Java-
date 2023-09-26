package 배열응용;

public class 여러개배열비교 {

	public static void main(String[] args) {
		int[] term1 = {77, 88, 99, 55, 70};
		int[] term2	= {99, 100, 88, 80, 70};
		//2학기에 오른 학생 수 카운트
		
		int upCount = 0;
		for(int i=0;i<term1.length;i++) {
			if(term1[i]<term2[i]) {
				upCount++;
			}
		}
		
		//1, 2학기 동일한 학생수와 번호
		int sameCount = 0;
		System.out.println("성적이 오른 학생의 수: " + upCount);
		
		for(int i=0;i<term1.length;i++) {
			if(term1[i]==term2[i]) {
				sameCount++;
				System.out.print(i + ". ");
			}
		}
		
	}

}
