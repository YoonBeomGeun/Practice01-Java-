package 상속;

public class 딸 {
	public String name;
	public String gender;
	static int wallet = 10000;
	static int count;
	
	public void tv보다() {
		System.out.println("tv를 보다.");
	}

	public 딸(String name, String gender) {
		this.name = name;
		this.gender = gender;
		count ++;
		
		if(wallet<=0) {
			System.out.println("더이상 용돈을 줄 수 없습니다,,");
		}else {
			wallet -= 1000;
		}
	}

	@Override
	public String toString() {
		return "딸 [name=" + name + ", gender=" + gender + "]";
	}
	
	
}
