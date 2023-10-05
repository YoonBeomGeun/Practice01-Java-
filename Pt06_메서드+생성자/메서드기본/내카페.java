package 메서드기본;

public class 내카페 {

	public static void main(String[] args) {
		// 게산기의 add 기능 사용하기
		// ==> 객체 생성 후, 필요한 메서드 사용
		// cal 변수 안에 계산기가 생성된 것의 위치(주소)가 들어있음.
		// ==> 생성된 주소를 통해서 메서드 사용이 가능
		계산기 cal = new 계산기();
		cal.add(); // void

		int sum = cal.add2(); // void x, int 타입의 데이터를 return함.
		System.out.println(sum - 1000);

		int total = cal.add3(3000, 5);
		System.out.println(total - 1000);

		int total2 = cal.add4(10000);
		System.out.println(total2 - 1000);
	}

}
