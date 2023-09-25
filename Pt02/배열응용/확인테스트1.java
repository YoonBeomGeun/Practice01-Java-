package 배열응용;

public class 확인테스트1 {

	public static void main(String[] args) {
		//int 저장공간에 200개 만들기
		int[] addr = new int[40];
		addr[0] = 1000;
		addr[1] = 2000;
		addr[2] = 3000;
		addr[addr.length-1] = 5000;
		
		for(int i : addr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		//double 저장공간에300개 만들기
		double[] addr2 = new double[300];
		addr2[0] = 10.1;
		addr2[1] = 20.2;
		addr2[2] = 30.3;
		addr2[addr2.length-1] = 50.5;
		
		for(double d : addr2) {
			System.out.print(d + " ");
		}
		
		System.out.println();

		//다양한 타입 배열 출력
		String[] s1 = {"산", "바다"};
		char[] c1 = {'r', 'g'};
		
		for(String s : s1) {
			System.out.print(s + " ");
		}
		for(char c : c1) {
			System.out.print(c + " ");
		}
		
	}

}
