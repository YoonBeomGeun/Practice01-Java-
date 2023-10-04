package 메서드연습;

import javax.swing.JOptionPane;

public class 반응여부테스트 {

	public static void main(String[] args) {
		int x = Integer.parseInt("100"); // 100
		System.out.println(x); // void

		String data = JOptionPane.showInputDialog("이름을 입력하세요.");
		// 입역한 데이터를 가져다 여기 주기때문
		JOptionPane.showMessageDialog(null, data); // void
	}

}
