package lesson13;

import java.util.Scanner;

// Ä«À× ´Þ·Â
public class No6_6064 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt();
		
		for(int i = 0; i < T; i++) {
			int M = scan.nextInt();
			int N = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			int lcm = M * N / gcd(M,N);
			int n = 0;
			int result = -1;
			while(n * M < lcm) {
				if((n * M + x - y) % N == 0) {
					result = n * M + x;
					break;
				}
				n++;
			}
			
			System.out.println(result);
		}
	}

	static int gcd(int n1, int n2) {
		if(n2 == 0)
			return n1;
		
		return gcd(n2, n1 % n2);
	}
}
