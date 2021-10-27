package lesson09;

import java.util.Scanner;

// 베르트랑 공준
public class No5_4948 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		while(true) {
			int n = scan.nextInt();
			int count = 0;
			if(n == 0) {
				break;
			}
			for(int i = n+1; i <= 2*n; i++) {
				if(isPrime(i) == true) {
					count++;
				}
			}
			System.out.println(count);
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
