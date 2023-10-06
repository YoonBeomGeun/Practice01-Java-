package 상속;

public class 증가스레드 extends Thread {
	public void run() {
		for(int i=1;i<11;i++) {
			System.out.println(i);
		}
	}

}
