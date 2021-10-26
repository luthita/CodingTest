package lesson09;

import java.util.Scanner;

// 소인수 분해
public class No3_11653 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		factorization(n);
		
	}

	public static void factorization(int num) {
		if(num == 1) {
			return;
		}
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) {
				System.out.println(i);
				factorization(num / i);
				break;
			}
		}
		
	}
}
