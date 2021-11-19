package lesson14;

import java.util.Scanner;

// 오르막수
public class No4_11057 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		
		int[][] arr = new int[1001][10];
		for(int i = 0; i < 10; i++) {
			arr[1][i] = 1;
		}
		
		for(int i = 2; i <= N; i++) {
			for(int j = 0; j <10; j++) {
				
				for(int k = j; k < 10; k++) {
					arr[i][j] += arr[i-1][k];
				}
				arr[i][j] %= 10007;
			}
		}
		
		int sum = 0;
		for(int i = 0; i <= 9; i++) {
			sum += arr[N][i];
		}
		
		System.out.println(sum % 10007);
	}

}
