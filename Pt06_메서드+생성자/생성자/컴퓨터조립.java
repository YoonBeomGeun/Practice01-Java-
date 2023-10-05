package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		컴퓨터 com1 = new 컴퓨터(50000, "LG", "65인치");
		System.out.println(com1);

		컴퓨터 com2 = new 컴퓨터(70000, "삼성", "65인치");
		System.out.println(com2);
	}

}
