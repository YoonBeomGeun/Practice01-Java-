package 부품만들기;

public class 전화기 {
	//멤버변수 + 멤버메서드
	public int size;	//기본형변수, 전역변수
	public String speaker;	//참조형변수, 전역변수
	
	public void 인터넷하다() {
		System.out.println("크롬으로 인터넷하다.");
		//기본적으로 상속받은 메서드가 8개 있음.
		//눈에 보이지는 않음.
		//상속받은 메서드를 재정의해서 쓸 수 있음.(오버라이드)
		
	}

	@Override
	public String toString() {
		return "전화기 [size=" + size + ", speaker=" + speaker + "]";
	}
}
