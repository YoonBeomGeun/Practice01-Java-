package 배열기본;

public class 배열기초확인 {

	public static void main(String[] args) {
		int[] s = new int[5];
		System.out.println(s.length);
		s[0] = 100;
		s[s.length-1] = 500;
		s[2] = 300;
		System.out.println(s[2]);
		for(int i : s) {
			System.out.println(i);
		}
		System.out.println(s[1]);

	}

}
