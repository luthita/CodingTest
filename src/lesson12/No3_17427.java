package lesson12;

import java.util.Scanner;

// 약수의 합
public class No3_17427 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int answer = 0;
		
		for(int i = 1; i <= N; i++) {
			answer += (N / i) * i;
		}
		System.out.println(answer);
		
	}
	
	// 내가 푼 풀이 : 시간 초과
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Scanner scan = new Scanner(System.in);
//		
//		int N = scan.nextInt();
//		
//		System.out.println(function(N));
//	}
//
//	public static int function(int num) {
//		
//		int answer = 0;
//		for(int i = 1; i <= num; i++) {
//			int result = 0;
//			
//			for(int j = 1; j <= i; j++) {
//				if(i % j == 0)
//					result += j;
//			}
//			answer += result;
//
//		}
//		
//		return answer;
//		
//	}
	
}
