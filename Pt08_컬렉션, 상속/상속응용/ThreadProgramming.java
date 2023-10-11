package 상속응용;

public class ThreadProgramming {

	public static void main(String[] args) {
		CounterThread th1 = new CounterThread();
		TimeCounter th2 = new TimeCounter();
		배열스레드 th3 = new 배열스레드();
		
		th1.start();
		th2.start();
		th3.start();
		
	}

}
