package lesson11;

import java.util.Scanner;

// 분해합
public class No2_2231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int result = 1000001;
		
		for(int i = 1; i <= N; i++) {
			int number = i;
			int sum = number;
			
			// 각 자리 수의 합
			while(number != 0) {
				sum += (number % 10);
				number /= 10;
			}
			
			// 합이 입력값과 같을 때
			if(sum == N) {
				result = result < i ? result : i;
				break;
			}
			
		}
		if(result != 1000001) {
			System.out.println(result);
		}else {
			System.out.println(0);
		}
		
	}

}
