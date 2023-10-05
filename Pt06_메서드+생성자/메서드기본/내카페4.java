package 메서드기본;

public class 내카페4 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 7, 8, 2, 2, 4, 5, 6, 9 };

		계산기4 cal = new 계산기4();

		System.out.println(cal.getEven(num));
		System.out.println(cal.getOdd(num));
		System.out.println(cal.getUnique(num));

	}

}
