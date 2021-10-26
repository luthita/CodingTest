package lesson09;

import java.util.Scanner;

// 소수 구하기
public class No4_1929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		for(int i = m; i <= n; i++) {
			if(isPrime(i) == true) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPrime(int num) {
		if(num == 1) {
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
