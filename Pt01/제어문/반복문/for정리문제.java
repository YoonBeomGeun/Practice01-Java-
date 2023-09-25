package 제어문.반복문;

public class for정리문제 {

	public static void main(String[] args) {
		
		//33~222까지 더하기
		int sum1 = 0;
		for(int i=33;i<223;i++) {
			sum1+=i;
		}
		System.out.println(sum1);
		System.out.println();
		
		
		//55부터 4500까지 2씩 점프하면서 더하기
		int sum2 = 0;
		for(int j=55;j<=4500;j+=2) {
			sum2+=j;
		}
		System.out.println(sum2);
		System.out.println();
		
		
		//1부터 1000까지 3씩 점프해서 더하기
		//만약 더한 값이 100이 넘으면 더하기 종료
		//5의 배수는 더하지 않기
		int sum3 = 0;
		for(int k=1;k<=1000;k+=2) {
			if(k%5!=0) {
				sum3 += k;
			}
			if(sum3>100) {
				System.out.println(sum3);
				break;
			}
			//System.out.println(sum3);
		}

	}

}
