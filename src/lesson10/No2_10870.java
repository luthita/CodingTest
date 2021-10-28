package lesson10;

import java.util.Scanner;

// 피보나치
public class No2_10870 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(fibonacci(n));
	
	}

	public static int fibonacci(int num) {
		if(num == 0) {
			return 0;
		} else if(num == 1) {
			return 1;
		}
		
		return fibonacci(num-1) + fibonacci(num-2);
	}
}
