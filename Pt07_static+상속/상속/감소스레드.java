package 상속;

public class 감소스레드 extends Thread {
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println(i);
		}
	}
}
