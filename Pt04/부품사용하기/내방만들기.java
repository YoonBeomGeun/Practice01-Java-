package 부품사용하기;

import 부품만들기.강아지;
import 부품만들기.전등;
import 부품만들기.전화기;

public class 내방만들기 {

	public static void main(String[] args) {
		//전화기 사용
		전화기 phone = new 전화기();
		phone.카톡하다();
		phone.인터넷하다();
		
		강아지 puppy = new 강아지();
		puppy.짖다();
		puppy.놀다();
		
		전등 light = new 전등();
		light.불을키다();
		light.불을끄다();
		
	}

}
