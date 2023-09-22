package 제어문.조건문;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int min = date.getMinutes();
		int sec = date.getSeconds();
		System.out.println(hour + "시 " + min + "분 " + sec + "초");

		int year = date.getYear() + 1900;		//123이 나옴, 1900을 더해줘야 함.
		int month = date.getMonth() + 1;		//음력 기준이라 +1 해줘야 함.
		int today = date.getDate();
		System.out.println(year + "년 " + month + "월 " + today + "일");
		
		int day = date.getDay();				//요일 0~6, 0이 일요일
		System.out.println(day);
	}

}
