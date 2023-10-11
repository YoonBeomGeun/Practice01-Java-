package 상속응용;

public class CounterThread extends Thread{
	@Override
	public void run() {
		for(int i=500;i>=0;i--) {
			System.out.println("카운터 >> " + i);
			//count.setText("카운터 >> " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();	//에러출력
			}
		}
	}

}
