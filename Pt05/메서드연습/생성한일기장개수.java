package 메서드연습;

import java.io.File;

public class 생성한일기장개수 {

	public static void main(String[] args) {
		File dir = new File(".");	// 현재위치 (프로젝트 폴더)
		String[] list = dir.list();
		int count = 0;
		for(String x : list) {
			if(x.contains(".txt")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
