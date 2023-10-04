package 메서드연습;

import java.io.File;
import java.util.Arrays;

public class 파일테스트 {

	public static void main(String[] args) {
		File file = new File("test.txt"); // 폴더와 파일
		boolean a = file.exists(); // void 아님, boolean 값으로 리턴
		System.out.println(a);
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		
		File folder = new File("../");	//folder == directory == package
		System.out.println(folder.isDirectory());
		String[] list = folder.list();
		System.out.println(Arrays.toString(list));
	}

}
