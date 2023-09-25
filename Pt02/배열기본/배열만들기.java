package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		//for문 이용하기
		
		int[] s = {1, 2, 3, 4};
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		for(int in : s) {
			System.out.println(in);
		}
	}

}
