package lesson14;

import java.util.Scanner;

// 점프
public class No7_1890 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();

		int[][] map = new int[N+1][N+1];
		int[][] dp = new int[N+1][N+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <=N; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		
		dp[1][1] = 1;
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <=N; j++) {
				
				// 끝에 도달했으면 초기화
				if(i == N && j == N && map[i][j] == 0)
					break;
				
				if(i + map[i][j] <= N) {
					dp[i+map[i][j]][j] += dp[i][j];
				}
				if(j + map[i][j] <= N) {
					dp[i][j+map[i][j]] += dp[i][j];
				}
				
			}
		}
		System.out.println(dp[N][N]);
		
		
	}

}
