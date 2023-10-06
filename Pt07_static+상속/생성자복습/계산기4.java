package 생성자복습;

import java.util.ArrayList;
import java.util.HashSet;

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
	public HashSet getUnique(int[] num) {
		HashSet list = new HashSet();	//HashSet은 중복값은 넣지 않음.
		for (int x : num) {
			list.add(x);
		}

		return list;
	}

}
