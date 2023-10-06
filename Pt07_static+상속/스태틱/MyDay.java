package 스태틱;

public class MyDay {

	public static int count = 0;	//main이 static 이기 때문에 static으로 전역변수를 만들지 않으면 main에서 사용할 수 없음.
	
	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		//System.out.println(Day.count);	//객체이름 대신 클래스 이름을 붙여줌(정석)
		Day day2 = new Day("여행", 15, "강원도");
		//System.out.println(Day.count);
		Day day3 = new Day("운동", 11, "피트니스");
		//System.out.println(Day.count);
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.count);
		System.out.println(Day.sum);
		System.out.println(Day.sum / Day.count);
	}

}
