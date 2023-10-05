package 생성자;

public class 컴퓨터 {
	// 멤버변수
	public int price;
	public String company;
	public String size;

	public 컴퓨터(int price, String company, String size) {
		this.price = price;
		this.company = company;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", company=" + company + ", size=" + size + "]";
	}

}
