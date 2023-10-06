package 스태틱;

public class 직원 {
	public String name;
	public int age;
	public String gender;
	public static int count;
	public static int sum;

	public 직원(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		count++;
		sum += age;
	}

	@Override
	public String toString() {
		return "직원 [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	//나이의 평균을 구해주는 메서드
	public static int getAge() {	//static을 쓰면 객체를 생성하지 않고도 사용할 수 있음.
		//static 메서드 안에서 instance를 쓰면 에러가 발생
		//static 메서드 아네서는 static 변수만 써야함.
		//에러원인: age는 힙영역의 변수. 힙영역의 변수는 객체를 생성 후에 만들어짐.
		//System.out.println(age);	//에러발생
		return sum / count;
	}

}
