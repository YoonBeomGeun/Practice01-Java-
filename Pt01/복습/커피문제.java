package 복습;

public class 커피문제 {

	public static void main(String[] args) {
		
		int count = 5;
		int price = 5000;
		int sum = count * price;
		String result = "";
		
		if(sum>20000) {
			result = "할인해 드릴게요!";
		}
		else {
			result = sum + "원 입니다.";
		}
		System.out.println(result);
	}
}
