package 제어문.조건문;

import java.util.Date;

public class 확인문제 {

	public static void main(String[] args) {
		
		//1번
		Date date = new Date();
		int year = date.getYear() + 1900;
		String result = "밀레니엄 세대가 아님";
		if(year>=2000) {
			result = "밀레니엄 세대";
		}
		System.out.println(result);
		
		
		//2번
		int day = date.getDay();
		switch(day) {
		case 0:
		case 6:
			System.out.println("쉬자~~~~~~~");
			break;
		default:
			System.out.println("열심히 공부하자!");
		}
		
		
		//3번
		int mon = date.getMonth();
		switch(mon) {
		case 2:
			System.out.println("28일까지");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30일까찌");
			break;
		default:
			System.out.println("31일까지");
			break;
		}
	}
}
