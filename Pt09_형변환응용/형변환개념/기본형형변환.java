package 형변환개념;

public class 기본형형변환 {

	public static void main(String[] args) {
		// 자동형변환
		byte x = 127; // 0110
		int y = x; // 0000000000000110 - 앞에 남은 자리를 0으로 채움
		// 형변환(byte(작은) --> int(큰))
		// 자동으로 타입 바뀜(문제없음!) - 자동형변환

		// 강제형변환
		byte z = (byte) y; // 앞에 0 자르고 0110으로 만들기
		// 형변환(int(큰) --> byte(작은))
		// 강제로 cpu가 가지고 와서 앞에 0 자르고 ram에 집어 넣음 - 강제형변환

		int a = 1000;
		byte b = (byte) a;
		System.out.println(b); // -24출력
		// byte --> -128~127
		// 강제형변환을 할 때는 작은 공간에 들어갈 수 있는 값만 넣을 수 있다.

	}

}
