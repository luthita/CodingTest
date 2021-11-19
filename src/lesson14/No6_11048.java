package lesson14;

import java.util.Scanner;

// 이동하기
public class No6_11048 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int M = scan.nextInt();
		// 지도 . 사탕 갯수
		int[][] map = new int[N+1][M+1];
		
		// i, j까지 가는데 얻은 사탕 개수
		int[][] dp = new int[N+1][M+1];
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= M; j++) {
				map[i][j] = scan.nextInt();
				
				dp[i][j] = Math.max(dp[i][j-1] + map[i][j], dp[i-1][j] + map[i][j]);
			}
		}
		System.out.println(dp[N][M]);
	}

}
