package 메서드기본;

import java.util.ArrayList;

public class 계산기4 {

	// 고정된 크기 ==> 배열 사용
	// 가변적 크기 ==> 컬렉션 사용!!

	public ArrayList<Integer> getEven(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : num) {
			if (x % 2 == 0) {
				list.add(x);
			}
		}
		return list;
	}

	public ArrayList<Integer> getOdd(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : num) {
			if (x % 2 != 0) {
				list.add(x);
			}
		}
		return list;
	}

	// Hashset을 사용해서 수정 필요.
	public ArrayList<Integer> getUnique(int[] num) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x : num) {
			if (!list.contains(x)) {
				list.add(x);
			}
		}

		return list;
	}

}
