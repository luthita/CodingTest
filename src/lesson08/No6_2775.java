package lesson08;

import java.util.Scanner;

// 부녀회장이 될테야
public class No6_2775 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int[][] apart = new int[15][15];
		for(int i = 0; i < 15; i++) {
			apart[i][1] = 1;
			apart[0][i] = i;
		}
		for(int i = 1; i < 15; i++) {
			for(int j =2; j < 15; j++) {
				apart[i][j] = apart[i][j - 1] + apart[i - 1][j];
			}
		}
		
		int count = scan.nextInt();
		
		for(int i = 0; i < count; i++) {
			int k = scan.nextInt();
			int n = scan.nextInt();
			System.out.println(apart[k][n]);
		}
	}

}
