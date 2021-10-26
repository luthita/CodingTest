package lesson09;

import java.util.Scanner;

// 소수
public class No2_2581 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int m = scan.nextInt();
		int n = scan.nextInt();
		
		int sum = 0;
		int min = 10001;
		for(int i = m; i <=n; i++) {
			if(isPrime(i) == true) {
				sum += i;
				min = (min > i) ? i : min;
			}
		}
		if(sum == 0) {
			System.out.println(-1);
		}else {
			System.out.println(sum);
			System.out.println(min);	
		}
	}

	public static boolean isPrime(int number) {
		if(number == 1) {
			return false;
		}
		for(int i = 2; i < number; i++) {
			if(number % i == 0) {
				return false;
			}
		}
		// 위 조건을 통과한다면 소수
		return true;
		
	}
}
