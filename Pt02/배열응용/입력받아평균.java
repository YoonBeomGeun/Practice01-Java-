package 배열응용;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		
		int[] n3 = new int[3];
		
		//입력 5개 받아서 저장, 꺼내서 누적하기
		for(int i=0; i<3; i++) {
			//입력값을 String으로 가져옴.
			String n = JOptionPane.showInputDialog("숫자 입력");
			//Integer형으로 변환 후, 배열에 저장
			n3[i] =Integer.parseInt(n);
		}
		//String list = Arrays.toString(n3);		//이거 보다는 밑에 방법을 더 많이 사용함.
		//System.out.println(list);
		System.out.println(Arrays.toString(n3));
		
		int sum = 0;
		for(int x : n3) {
			sum = sum + x;
		}
		System.out.println(sum);
		System.out.println((double)sum/n3.length);
	}

}
