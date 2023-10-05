package 생성자;

import java.util.Arrays;

import 부품만들기.TV;

public class 내거실 {

	public static void main(String[] args) {
//		TV tv = new TV();
//		tv.ch = 5;
//		tv.onOff = false;
//		tv.vol = 50;
//		
//		System.out.println(tv);
		TV2 tv2 = new TV2(5, 20, true);
		
		System.out.println(tv2);
	}

}
