package 상속응용;

public class 배열스레드 extends Thread {
	@Override
	public void run() {
		String[] list = {"영화1.jpg", "영화2.jpg", "영화3.jpg", "영화4.jpg", "영화5.jpg"};
		for(int i=0;i<list.length;i++) {
			System.out.println("이미지 >> " + list[i]);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==4) {
				i=-1;
			}
		}
	}
}
