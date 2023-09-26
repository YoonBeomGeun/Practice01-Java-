package 배열응용;

public class 여러개배열사용 {

	public static void main(String[] args) {
		String[] 식구 =  {"아버지","어머니","형","나","동생"};
		int[] 나이 = {100, 99, 88, 77, 55};
		double[] 키 = {199.9, 189.9, 179.9, 169.9, 159.9};
		
		System.out.println("우리집 식구 정리");
		System.out.println("=====================");
		System.out.println("이름\t나이\t키");
		System.out.println("=====================");
		
		for(int i=0;i<식구.length;i++) {
			System.out.println(식구[i] + "\t" + 나이[i] + "\t" + 키[i]);
		}
		System.out.println("=====================");

		
	}

}
