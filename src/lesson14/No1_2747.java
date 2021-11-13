package lesson14;

import java.util.Scanner;

// 피보나치 수
public class No1_2747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] fibonacci = new int[N+1];
		
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		
		for(int i = 2; i <= N; i++) {
			fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
		}
		System.out.println(fibonacci[N]);
	}


}
