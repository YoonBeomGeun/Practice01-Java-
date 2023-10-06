package 생성자복습;

import java.util.ArrayList;
import java.util.HashSet;

public class 내카페4 {

	public static void main(String[] args) {
		int[] num = { 1, 3, 4, 5, 7, 8, 2, 2, 4, 5, 6, 9 };

		계산기4 cal = new 계산기4();

		ArrayList<Integer> list1 = cal.getEven(num);
		System.out.println(list1);
		
		ArrayList<Integer> list2 = cal.getOdd(num);
		System.out.println(list2);
		HashSet list3 = cal.getUnique(num);
		System.out.println(list3);

	}

}
