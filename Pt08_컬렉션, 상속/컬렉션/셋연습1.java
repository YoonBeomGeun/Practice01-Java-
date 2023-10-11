package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;

public class 셋연습1 {

	public static void main(String[] args) {
		//로또 문제
		HashSet lotto = new HashSet();	//고정길이, 같은 타입
		
		Random r = new Random();
		
		//for 문
		for(int i=0;i<6;i++) {
			lotto.add(r.nextInt(45)+1);
		}
		
		//while 문
//		while(true) {
//			lotto.add(r.nextInt(45)+1);
//			if(lotto.size()==6) {
//				break;
//			}
//		}
		
		System.out.println(lotto);
	}

}
