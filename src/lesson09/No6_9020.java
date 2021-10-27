package lesson09;

import java.util.Scanner;

// ∞ÒµÂπŸ»Â¿« √ﬂ√¯
public class No6_9020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		for(int i = 0; i < count; i++) {
			int n = scan.nextInt();
			
			for(int j = n/2; j > 0; j--) {
				if(isPrime(j) == false || isPrime(n-j) == false) {
					continue;
				}
				System.out.println(j + " " + (n-j));
				break;
			}
		}
	}
	public static boolean isPrime(int num) {
		if( num == 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
