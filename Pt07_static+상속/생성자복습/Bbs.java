package 생성자복습;

public class Bbs {
	public int no;
	public String title;
	public String content;
	public String writer;
	//객체 생성 시 4개의 멤버변수를 초기화하고 싶으면 생성자 생성.
	
	public Bbs(int no, String title, String content, String writer) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	@Override
	public String toString() {
		return no + "\t" + title + "\t" + content + "\t" + writer;
	}
	
	
	
}
