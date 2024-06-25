package 형변환응용;

import java.io.IOException;

import javax.swing.JOptionPane;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public static void main(String[] args) {

		// 005930, 086520, 022100
		String company = JOptionPane.showInputDialog("코드를 입력하세요.	ex) 005930, 086520, 022100");
		// 코드를 입력받고 코드에 해당하는 주식의 정보 보여주기
		Connection conn = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + company); // Connection
		//System.out.println(conn); // 연결을 담당하는 객체
		
		Connection chart = Jsoup.connect("https://finance.naver.com/sise/lastsearch2.naver");
		
		try {
			Document doc = conn.get(); // 연결 담당하는 객체
			// System.out.println(doc); //해당 페이지의 코드 모두 출력
			Elements list = doc.select("span.code"); // ArrayList =상속=> Elements
			// 조건에 맞는 태그들의 리스트를 객체 {태그, 태그, 태그, ...}
			// Element == tag
			// Elements == tag 리스트
			System.out.println(list.size());
			// span 태그의 code라는 클래스에서 텍스트만 추출
			// 리스트에 코드가 하나밖에 없어서 get(0)으로 했음.
			// 여러 개라면 for문 적용
			System.out.println(list.get(0).text());

			System.out.println("==============================");
			Elements list2 = doc.select("td.first span.blind");
			// td.first와 span.blind 사이에 공백은 td.first안 어딘가에 span.blind가 있다는 의미
			// td.first > span.blind는 td.first 바로 아래에 있다는 의미
			System.out.println(list2.size());
			System.out.println(list2.get(0)); // 전일가
			System.out.println(list2.get(1)); // 시가
			String yes = list2.get(0).text();
			String start = list2.get(1).text();
			System.out.println("전일가 >> " + yes);
			System.out.println("시가 >> " + start);
			
//			System.out.println("==============================");
//			Document doc2 = chart.get();
//			Elements list3 = doc2.select("tr");
//			System.out.println(list3.size());
//			System.out.println(list3.get(0).text());

		} catch (IOException e) {
			e.printStackTrace();
		}
		// 연결한 사이트에서 코드를 다 가지고 온다. html문서에 대한 코드 Document
		// 위험한 상황 - 외부자원 연결(cpu, file), network
		// 위험한 상황에 대해서는 상황이 발생했을 때 어떻게 처리할지를 반드시 명시해야한다.
	}

}