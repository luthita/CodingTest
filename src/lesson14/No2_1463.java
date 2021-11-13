package lesson14;

import java.util.Scanner;

// 1로 만들기
public class No2_1463 {

	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] dp = new int[N+1];
		dp[0] = 0;
		dp[1] = 0;
		
		for(int i = 2; i <= N; i++) {
			dp[i] = dp[i-1] + 1;
			if(i % 3 == 0) {
				dp[i] = Math.min(dp[i/3]+1, dp[i]);
			}
			else if(i % 2 == 0) {
				dp[i] = Math.min(dp[i/2]+1, dp[i]);
			}
			
		}
		System.out.println(dp[N]);
		
	}

}
