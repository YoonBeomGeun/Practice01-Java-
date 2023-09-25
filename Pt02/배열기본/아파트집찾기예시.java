package 배열기본;

public class 아파트집찾기예시 {

	public static void main(String[] args) {
		int[] s = {10, 15, 20, 10};
		System.out.println("배열이 들어있는 주소");
		System.out.println(s);
		//s안에 들어있는 주소가 가르키는 첫 번째 값을 프린트
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);
		System.out.println(s[3]);
		System.out.println("전체 s가 가르키는 방의 수 >> " + s.length);
		//s.length는 읽기 전용
		
	}

}
