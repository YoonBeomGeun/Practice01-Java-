package 제어문.반복문;

import java.util.Random;

public class 랜덤Test {

	public static void main(String[] args) {
		Random r = new Random(10);			//지정값을 똑같이 잆력한 사람들은 모두 같은 값이 나옴(씨앗값)
		int target = r.nextInt(100)+1;		//0부터 지정 값보다 하나 적게
		System.out.println(target);
	}

}
