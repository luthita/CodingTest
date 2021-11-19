package lesson14;

import java.util.Scanner;

// 쉬운 계단 수
public class No5_10844 {

	final static long MOD = 1000000000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		long[][] dp = new long[N+1][10];
		
		dp[1][0] = 0;
		// dp[i][j] : i(길이), j(자릿 값), 즉  길이 i 이며 끝 자릿수가 j인 개수
		// i == 1 이면, j가 어떤 값이여도 올 수 있는 개수는 1개
		for(int i = 1; i <= 9; i++) {
			dp[1][i] = 1;
		}
		
		for(int i = 2; i <= N; i++) {
			dp[i][0] = dp[i-1][1] % MOD;
			
			for(int j = 1; j <= 8; j++) {
				dp[i][j] = (dp[i-1][j-1] % MOD + dp[i-1][j+1] % MOD) % MOD;
			}
			
			dp[i][9] = dp[i-1][8] % MOD;
			
		}
		
		long result = 0;
		for(int i = 0; i < 10; i++) {
			result = (result + dp[N][i]) % MOD;
		}
		System.out.println(result);
		
	}

}
