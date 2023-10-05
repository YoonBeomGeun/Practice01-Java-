package 생성자;

public class MaskUse {

	public static void main(String[] args) {
		Mask mask1 = new Mask("흰색", 3000, 5);	//색, 가격, 개수
		Mask mask2 = new Mask("검정색", 2500, 2);	//색, 가격, 개수
		
		System.out.println(mask1);
		System.out.println(mask2);
	}

}
