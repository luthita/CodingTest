package lesson11;

import java.util.Scanner;

// µ¢Ä¡
public class No3_7568 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i = 0; i < N; i++) {
			x[i] = scan.nextInt();
			y[i] = scan.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) {
					continue;
				}
				if(x[i] < x[j] && y[i] < y[j]) {
					rank++;
				}
				
			}
			System.out.print(rank + " ");
		}
	}

}
