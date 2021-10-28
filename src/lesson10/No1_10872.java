package lesson10;

import java.util.Scanner;

// ÆÑÅä¸®¾ó
public class No1_10872 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(factorial(n));
	}

	public static int factorial(int num) {
		if( num == 0) {
			return 1;
		}
		return num * factorial(num-1);
	}
	
}
