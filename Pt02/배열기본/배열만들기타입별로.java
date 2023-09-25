package 배열기본;

public class 배열만들기타입별로 {

	public static void main(String[] args) {
		int[] age = {200, 100, 50, 10};
		for(int i=0;i<age.length;i++) {
			System.out.println(age[i] + " ");
		}
		System.out.println();
		for(int x : age) {
			System.out.println(x + " ");
		}
		System.out.println();

		double[] weight = {99.9, 88.8, 77.7, 66.6};
		for(int i=0;i<weight.length;i++) {
			System.out.println(weight[i] + " ");
		}
		System.out.println();

		for(double d : weight) {
			System.out.println(d + " ");
		}
		System.out.println();

		String[] name = {"a", "b", "c"};
		for(String string : name) {
			System.out.println(string + " ");
		}
		System.out.println();

		char[] gender = {'m', 'w'};
		for (char c : gender) {
			System.out.println(c + " ");

		}
	}

}
